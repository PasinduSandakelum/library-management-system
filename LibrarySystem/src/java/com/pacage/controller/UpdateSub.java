/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacage.controller;

import com.pacage.data.MainClassificationDao;
import com.pacage.data.SubClassificationDao;
import com.pacage.model.MainClassification;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pasindu
 */
public class UpdateSub extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    SubClassificationDao subDao = new SubClassificationDao();
    MainClassificationDao mainDao = new MainClassificationDao();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateSub</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateSub at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("type").equals("fill")) {
            String mainId = request.getParameter("mainId");
            String subId = request.getParameter("subId");
            String subName = request.getParameter("subName");
            ArrayList<MainClassification> mainList;
            try {
                mainList = mainDao.getAllMainClassifications();
                request.setAttribute("mainClassifications", mainList);
                request.setAttribute("subId", subId);
                request.setAttribute("subName", subName);
                request.setAttribute("mainId", mainId);
                request.getRequestDispatcher("/EditSub.jsp").forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(UpdateSub.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (request.getParameter("type").equals("edit")) {
            String mainId = request.getParameter("mainId");
            String subId = request.getParameter("subId");
            String subName = request.getParameter("subClassification");
            try {
                boolean test = subDao.editSubClassification(mainId,subId,subName);
                if (test) {
                    request.setAttribute("error", "<div class=\"col-sm-8 col-sm-offset-2\">\n"
                            + "            <div class=\"alert alert-success alert-dismissible\">\n"
                            + "                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n"
                            + "                <strong>Success</strong>Sub classification was updated!<a href=\"SearchSub?type=all\"><span class=\"btn btn-md\" ><span class=\"glyphicon glyphicon-search\"></span>View All</span></a>\n"
                            + "            </div>\n"
                            + "        </div>");
                    request.getRequestDispatcher("/EditSub.jsp").forward(request, response);
                } else {
                    request.setAttribute("error", "<div class=\"col-sm-8 col-sm-offset-2\">\n"
                            + "            <div class=\"alert alert-warning alert-dismissible\">\n"
                            + "                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n"
                            + "                <strong>Problem</strong>There is a problem!\n"
                            + "            </div>\n"
                            + "        </div>");
                    request.getRequestDispatcher("/EditSub.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
