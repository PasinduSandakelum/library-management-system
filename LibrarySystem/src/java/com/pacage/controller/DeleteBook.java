/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacage.controller;

import com.pacage.data.BookDao;
import com.pacage.model.BookSearch;
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
public class DeleteBook extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    BookDao bookDao = new BookDao();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
        String bookId = request.getParameter("bookId");
        String selection = request.getParameter("selection");
        String sname = request.getParameter("sname");
        ArrayList<BookSearch> bookSearch = new ArrayList<>();

        try {

            boolean b = bookDao.deleteBook(bookId);
            if (b) {
                if (selection.equals("mainClassification")) {
                    bookSearch = bookDao.getBookByMainClassification(sname);
                } else if (selection.equals("subClassification")) {
                    bookSearch = bookDao.getBookBySubClassification(sname);
                } else {
                    bookSearch = bookDao.getBookByOneField(selection, sname);
                }
                request.setAttribute("books", bookSearch);
                request.setAttribute("sub", sname);
//                request.setAttribute("error", "<div class=\"alert alert-success\"> Successfully Deleted !</div>");
                request.getRequestDispatcher("/SearchBook.jsp").forward(request, response);
            }
//else {
//                request.setAttribute("books", bookSearch);
//                request.setAttribute("sub", sname);
//                request.setAttribute("ref", "refresh");
//                request.setAttribute("error", "<div class=\"alert alert-success\"> Ooops Error !</div>");
//                request.getRequestDispatcher("/SearchBook.jsp").forward(request, response);
//            }

        } catch (Exception ex) {
            Logger.getLogger(SearchBook.class.getName()).log(Level.SEVERE, null, ex);
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
