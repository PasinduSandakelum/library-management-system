/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacage.controller;

import com.pacage.data.SubClassificationDao;
import com.pacage.model.MainClassification;
import com.pacage.model.SubClassification;
import com.pacage.model.SubSearch;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
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
public class SearchSub extends HttpServlet {

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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

//        String subClassification = request.getParameter("subClassification");
//
//        ArrayList<SubSearch> subList = new ArrayList<>();
//
//        try {
//            subList = subDao.searchSubClass(subClassification);
//            request.setAttribute("subClassifications", subList);
//            request.getRequestDispatcher("/SearchSubClassification.jsp").forward(request, response);
//        } catch (Exception ex) {
//            Logger.getLogger(SearchBook.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
        ArrayList<ArrayList<String>> subSearch = new ArrayList<>();
        String type = request.getParameter("type");
        if (type.equals("all")) {
            try {
                subSearch = subDao.getAllSubClass();
                request.setAttribute("subClassifications", subSearch);
                request.getRequestDispatcher("/SearchSubClassification.jsp").forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(SearchMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(type.equals("search")){
            String subClassification = request.getParameter("subClassification");
            String selection = request.getParameter("selection");
            try {
                subSearch = subDao.searchSubClass(selection,subClassification);
                request.setAttribute("subClassifications", subSearch);
                request.getRequestDispatcher("/SearchSubClassification.jsp").forward(request, response);
            } catch (Exception ex) {
                Logger.getLogger(SearchBook.class.getName()).log(Level.SEVERE, null, ex);
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
