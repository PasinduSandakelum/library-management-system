/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacage.model;

/**
 *
 * @author pasindu
 */
public class Book {
    String bookId;
    String title;
    String author;
    String lastPrintYear;
    String yearOfPrint;
    String isbnNo;
    Integer noOfPages;

    public Book() {
    }
    
    
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLastPrintYear() {
        return lastPrintYear;
    }

    public void setLastPrintYear(String lastPrintYear) {
        this.lastPrintYear = lastPrintYear;
    }

    public String getYearOfPrint() {
        return yearOfPrint;
    }

    public void setYearOfPrint(String yearOfPrint) {
        this.yearOfPrint = yearOfPrint;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public Integer getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(Integer noOfPages) {
        this.noOfPages = noOfPages;
    }
    
    
}
