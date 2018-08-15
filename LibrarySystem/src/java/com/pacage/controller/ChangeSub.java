/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacage.controller;

import com.pacage.data.MainClassificationDao;
import com.pacage.data.SubClassificationDao;
import com.pacage.model.MainClassification;
import com.pacage.model.SubClassification;
import java.io.IOException;
import java.io.PrintWriter;
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
public class ChangeSub extends HttpServlet {

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
    SubClassificationDao subDao = new SubClassificationDao();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ChangeSub</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ChangeSub at " + request.getContextPath() + "</h1>");
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
        try {
            ArrayList<MainClassification> mainClass = mainDao.getAllMainClass();
           
            ArrayList<SubClassification> subClass = subDao.getAllSubClassifications();
//            subClass = subDao.getAllSubClassOfMainClass(request.getParameter("mainClassification"));
            request.setAttribute("mainClassifications", mainClass);
            request.setAttribute("subClassifications", subClass);
            request.setAttribute("mainClassificationId", request.getParameter("mainClassification"));
            request.getRequestDispatcher("/test1.jsp").forward(request, response);
        } catch (Exception e) {
            Logger.getLogger(BookServlet.class.getName()).log(Level.SEVERE, null, e);
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
        try {
            //ArrayList<MainClassification> mainClass = new ArrayList<>();
            //mainClass = mainDao.getAllMainClass();
            ArrayList<SubClassification> subClass = new ArrayList<>();
            subClass = subDao.getAllSubClassOfMainClass(request.getParameter("mainClassification"));
//            request.setAttribute("mainClassifications", mainClass);
            request.setAttribute("subClassifications", subClass);
            request.setAttribute("mainName", request.getParameter("mainClassification"));
            request.getRequestDispatcher("/test1.jsp").forward(request, response);
        } catch (Exception e) {
            Logger.getLogger(BookServlet.class.getName()).log(Level.SEVERE, null, e);
        }
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
