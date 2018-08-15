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
public class BookSearch {
    private Book book;
    private SubClassification sub;
    private MainClassification main;

    public BookSearch(Book book, SubClassification sub, MainClassification main) {
        this.book = book;
        this.sub = sub;
        this.main = main;
    }

    public BookSearch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public SubClassification getSub() {
        return sub;
    }

    public void setSub(SubClassification sub) {
        this.sub = sub;
    }

    public MainClassification getMain() {
        return main;
    }

    public void setMain(MainClassification main) {
        this.main = main;
    }
    
}
