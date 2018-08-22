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
        String bookId = request.getParameter("bookId");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String yearOfPrint = request.getParameter("yearOfPrint");
        String lastPrintYear = request.getParameter("lastPrintYear");
        String isbnNo = request.getParameter("isbnNo");
        String noOfPages = request.getParameter("noOfPages");
        String mainId = request.getParameter("mainId");
        try {

//            request.setAttribute("mainName", request.getParameter("mainClassification"));
            if (request.getParameter("type").equals("add")) {
                ArrayList<MainClassification> mainList = new ArrayList<>();
                mainList = mainDao.getAllMainClassifications();
                ArrayList<SubClassification> subList = new ArrayList<>();
                subList = subDao.getAllSubClassOfMainClass(mainId);
                request.setAttribute("mainClassifications", mainList);
                request.setAttribute("subClassifications", subList);
                request.setAttribute("bookId", bookId);
                request.setAttribute("title", title);
                request.setAttribute("author", author);
                request.setAttribute("yearOfPrint", yearOfPrint);
                request.setAttribute("lastPrintYear", lastPrintYear);
                request.setAttribute("isbnNo", isbnNo);
                request.setAttribute("noOfPages", noOfPages);
                request.setAttribute("mainId", mainId);
                request.getRequestDispatcher("/AddBook.jsp").forward(request, response);
            } else if (request.getParameter("type").equals("update")) {
                ArrayList<MainClassification> mainList = new ArrayList<>();
                mainList = mainDao.getAllMainClassifications();
                ArrayList<SubClassification> subList = new ArrayList<>();
                subList = subDao.getAllSubClassOfMainClass(mainId);
                request.setAttribute("mainClassifications", mainList);
                request.setAttribute("subClassifications", subList);
                request.setAttribute("bookIdEdit", bookId);
                request.setAttribute("titleEdit", title);
                request.setAttribute("authorEdit", author);
                request.setAttribute("yearOfPrintEdit", yearOfPrint);
                request.setAttribute("lastPrintYearEdit", lastPrintYear);
                request.setAttribute("isbnNoEdit", isbnNo);
                request.setAttribute("noOfPagesEdit", noOfPages);
                request.setAttribute("mainId", mainId);
                request.getRequestDispatcher("/EditBook.jsp").forward(request, response);
            }

        } catch (Exception e) {
            Logger.getLogger(BookServlet.class.getName()).log(Level.SEVERE, null, e);
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
        processRequest(request, response);

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
        processRequest(request, response);

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
