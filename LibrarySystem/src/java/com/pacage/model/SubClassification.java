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
public class SubClassification {
    String sid;
    String sname;

    public SubClassification(String mid, String sid, String sname) {
//        this.mid = mid;
        this.sid = sid;
        this.sname = sname;
    }

    public SubClassification() {
    }

//    public String getMid() {
//        return mid;
//    }

    public String getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

//    public void setMid(String mid) {
//        this.mid = mid;
//    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    
}
