/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacage.controller;

import com.pacage.data.BookDao;
import com.pacage.model.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
public class BookServlet extends HttpServlet {
    Book book = new Book();
    BookDao bookDao = new BookDao();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BookServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BookServlet at " + request.getContextPath() + "</h1>");
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
        String bookId = request.getParameter("bookId");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String subId = request.getParameter("subClassificationId");
        String yearOfPrint = request.getParameter("yearOfPrint");
        String lastPrintYear = request.getParameter("lastPrintYear");
        String isbnNo = request.getParameter("isbnNo");
        Integer noOfPages = Integer.parseInt(request.getParameter("noOfPages"));
        
        book.setBookId(bookId);
        book.setTitle(title);
        book.setAuthor(author);
        book.setYearOfPrint(yearOfPrint);
        book.setLastPrintYear(lastPrintYear);
        book.setIsbnNo(isbnNo);
        book.setNoOfPages(noOfPages);
        PrintWriter out = response.getWriter();
        try {
            boolean b = bookDao.saveBook(book, subId);
            if (b) {
                request.setAttribute("error", "<div class=\"col-sm-8 col-sm-offset-2\">\n"
                        + "            <div class=\"alert alert-success alert-dismissible\">\n"
                        + "                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n"
                        + "                <strong>Success,</strong>Book Added ! <a href=\"SearchBook?type=all\"><span class=\"btn btn-md\" ><span class=\"glyphicon glyphicon-search\"></span>View All</span></a>\n"
                        + "            </div>\n"
                        + "        </div>");
                request.getRequestDispatcher("/AddBook.jsp").forward(request, response);
            } else {
                request.setAttribute("error", "<div class=\"col-sm-8 col-sm-offset-2\">\n"
                        + "            <div class=\"alert alert-warning alert-dismissible\">\n"
                        + "                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n"
                        + "                <strong>Warning,</strong>Book ID already exists !\n"
                        + "            </div>\n"
                        + "        </div>");
                request.getRequestDispatcher("/AddBook.jsp").forward(request, response);
            }
                
                //out.println("Success");
            
//            else{
//                request.setAttribute("successMessage", "Something went wrong !.");
//                request.getRequestDispatcher("/SuccessMessage.jsp").forward(request, response);
//            }
        } catch (SQLException ex) {
            Logger.getLogger(BookServlet.class.getName()).log(Level.SEVERE, null, ex);
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
