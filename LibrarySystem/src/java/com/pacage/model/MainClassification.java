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
public class MainClassification {
   private String mid;
   private String mname;

    public MainClassification(String mid, String mname) {
        this.mid = mid;
        this.mname = mname;
    }

    public MainClassification() {
    }

    public String getMid() {
        return mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
    
}
