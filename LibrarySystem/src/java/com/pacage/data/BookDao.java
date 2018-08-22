/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacage.data;

import com.pacage.model.Book;
import com.pacage.model.BookSearch;
import com.pacage.model.MainClassification;
import com.pacage.model.SubClassification;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pasindu
 */
public class BookDao {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private BookSearch extractBookSearch(ResultSet rs) throws SQLException {
        con = DbConnect.getConnection();
        Book book = new Book();

        SubClassification sub = new SubClassification();
        MainClassification main = new MainClassification();

        //bookId, title, author, yearOfPrint, lastPrintedYear, isbnNo, noOfPages
        book.setBookId(rs.getString("bookId"));
        book.setTitle(rs.getString("title"));
        book.setAuthor(rs.getString("author"));
        book.setYearOfPrint(rs.getString("yearOfPrint"));
        book.setLastPrintYear(rs.getString("lastPrintedYear"));
        book.setIsbnNo(rs.getString("isbnNo"));
        book.setNoOfPages(rs.getInt("noOfPages"));

        String bookId = rs.getString("bookId");
        String sql = "SELECT * FROM sub_classification WHERE subId = (SELECT subId FROM book_sub WHERE bookId =?)";
        String sql1 = "SELECT * FROM main_classification WHERE mainId = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, bookId);
            rs = pst.executeQuery();
            if (rs.next()) {
                String subId = rs.getString("subId");
                String subName = rs.getString("subClassificationName");
                String mainId = rs.getString("mainId");

                sub.setSid(subId);
                sub.setSname(subName);
                //book.setSubClassification(sub);

                pst = con.prepareStatement(sql1);
                pst.setString(1, mainId);
                rs = pst.executeQuery();
                if (rs.next()) {
                    String mainName = rs.getString("mainClassificationName");
                    main.setMid(mainId);
                    main.setMname(mainName);
                    //book.setMainClassification(main);
                    BookSearch bookSearch = new BookSearch(book, sub, main);
                    return bookSearch;
                }

            }
        } catch (Exception e) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }

    public boolean saveBook(Book book, String subId) throws SQLException {
        con = DbConnect.getConnection();
        String q = "INSERT INTO book_details VALUES(?,?,?,?,?,?,?);";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, book.getBookId());
            pst.setString(2, book.getTitle());
            pst.setString(3, book.getAuthor());
            pst.setString(4, book.getYearOfPrint());
            pst.setString(5, book.getLastPrintYear());
            pst.setString(6, book.getIsbnNo());
            pst.setInt(7, book.getNoOfPages());

            int i = pst.executeUpdate();
            if (i == 1) {
                String q1 = "INSERT INTO book_sub VALUES(null,?,?);";
                pst = con.prepareStatement(q1);
                pst.setString(1, book.getBookId());
                pst.setString(2, subId);
                int j = pst.executeUpdate();
                if (j == 1) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<BookSearch> getAllBooks() throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM book_details";
        ArrayList<BookSearch> bk = new ArrayList<>();

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();

            while (rs.next()) {
                BookSearch b = extractBookSearch(rs);
                bk.add(b);
            }

        } catch (SQLException e) {
        }
        return bk;
    }

    public BookSearch getBookSearch(String bookId) throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM book_details WHERE bookId=?";
        try {
            pst = con.prepareStatement(q);
            pst.setString(1, bookId);

            rs = pst.executeQuery();

            if (rs.next()) {
                BookSearch bs = extractBookSearch(rs);
                return bs;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<BookSearch> getBookByOneField(String one, String d) throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM book_details WHERE " + one + "=?";
        ArrayList<BookSearch> bookSearch = new ArrayList<>();
        try {
            pst = con.prepareStatement(q);
            pst.setString(1, d);

            rs = pst.executeQuery();

            while (rs.next()) {
                BookSearch bs = extractBookSearch(rs);
                bookSearch.add(bs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookSearch;
    }

    public ArrayList<BookSearch> getBookBySubClassification(String subClassification) throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM book_details WHERE bookId IN (SELECT bookId FROM book_sub WHERE subId = (SELECT subId FROM sub_classification WHERE subClassificationName = ?))";

        try {
            pst = con.prepareStatement(q);
            pst.setString(1, subClassification);

            rs = pst.executeQuery();
            ArrayList<BookSearch> bookSearch = new ArrayList<>();
            while (rs.next()) {
                BookSearch bs = extractBookSearch(rs);
                bookSearch.add(bs);
            }
            return bookSearch;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<BookSearch> getBookByMainClassification(String mainClassification) throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM book_details WHERE bookId IN (SELECT bookId FROM book_sub WHERE subId IN (SELECT subId FROM sub_classification WHERE mainId = (SELECT mainId FROM main_classification WHERE mainClassificationName = ?)))";

        try {
            pst = con.prepareStatement(q);
            pst.setString(1, mainClassification);

            rs = pst.executeQuery();
            ArrayList<BookSearch> bookSearch = new ArrayList<>();
            while (rs.next()) {
                BookSearch bs = extractBookSearch(rs);
                bookSearch.add(bs);
            }
            return bookSearch;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<BookSearch> getBooksByTwoFields(String fone, String d1, String ftwo, String d2) throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM book_details WHERE " + fone + "=? AND " + ftwo + "=?";

        try {
            pst = con.prepareStatement(q);
            pst.setString(1, d1);
            pst.setString(2, d2);

            rs = pst.executeQuery();
            ArrayList<BookSearch> bk = new ArrayList<>();
            while (rs.next()) {
                BookSearch b = extractBookSearch(rs);
                bk.add(b);
            }
            return bk;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public boolean checkBookAvailable(String bId) throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM books WHERE bookID = '" + bId + "'";

        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateBook(Book book, String subId) throws SQLException {
        con = DbConnect.getConnection();
//        bookId, title, author, yearOfPrint, lastPrintedYear, isbnNo, noOfPages
        String q = "UPDATE book_details SET  title=?, author=?, yearOfPrint=?, lastPrintedYear=?, isbnNo=?, noOfPages=? WHERE bookID=? ";
        String q1 = "UPDATE book_sub SET subId=? WHERE bookId=?";
        try {
            pst = con.prepareStatement(q);

            pst.setString(1, book.getTitle());
            pst.setString(2, book.getAuthor());
            pst.setString(3, book.getYearOfPrint());
            pst.setString(4, book.getLastPrintYear());
            pst.setString(5, book.getIsbnNo());
            pst.setInt(6, book.getNoOfPages());
            pst.setString(7, book.getBookId());

            int i = pst.executeUpdate();

            if (i == 1) {
                pst = con.prepareStatement(q1);
                pst.setString(1, subId);
                pst.setString(2, book.getBookId());
                int j = pst.executeUpdate();
                if (j == 1) {
                    return true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteBook(String bookId) throws SQLException {
        con = DbConnect.getConnection();
        String q = "DELETE FROM book_details WHERE bookID=?";
        String q1 = "DELETE FROM book_sub WHERE bookID=?";
        try {
            pst = con.prepareStatement(q);
            pst.setString(1, bookId);
            int i = pst.executeUpdate();
            if (i == 1) {
                pst = con.prepareStatement(q1);
                pst.setString(1, bookId);
                int j = pst.executeUpdate();
                if (j == 1) {
                    return true;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
