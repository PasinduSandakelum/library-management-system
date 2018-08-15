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
public class subSearch {
    SubClassification sub;
    MainClassification main;

    public subSearch(SubClassification sub, MainClassification main) {
        this.sub = sub;
        this.main = main;
    }

    public subSearch() {
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
