/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacage.controller;

import com.pacage.data.MainClassificationDao;
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
public class DeleteMain extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    MainClassificationDao mainDao = new MainClassificationDao();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DeleteMain</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DeleteMain at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        ArrayList<MainClassification> mainSearch = new ArrayList<>();
        String mainId = request.getParameter("mainId");
        try {
            boolean test = mainDao.deleteMainClassification(mainId);
            if (test) {
                try {
                    mainSearch = mainDao.getAllMainClassifications();
                    request.setAttribute("mainClassifications", mainSearch);
                    request.getRequestDispatcher("/SearchMainClassification.jsp").forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(SearchMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                request.setAttribute("error", "<div class=\"col-sm-8 col-sm-offset-2\">\n"
                        + "            <div class=\"alert alert-warning alert-dismissible\">\n"
                        + "                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n"
                        + "                <strong>Not allow,</strong>Sub classifications are available under this main classification !\n"
                        + "            </div>\n"
                        + "        </div>");
                request.getRequestDispatcher("/SearchMainClassification.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteMain.class.getName()).log(Level.SEVERE, null, ex);
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
        //processRequest(request, response);
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
