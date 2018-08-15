/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacage.data;

import com.pacage.model.MainClassification;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pasindu
 */
public class MainClassificationDao{
    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection con = null;

    public MainClassificationDao() {
    }
    
    private MainClassification extractMainClassification(ResultSet rs) throws SQLException{
        MainClassification main = new MainClassification();
        
        main.setMid(rs.getString("mainId"));
        main.setMname(rs.getString("mainClassificationName"));
        
        return main;
    }
    public MainClassification getMainClassification(String mainId){
        String q = "SELECT * FROM main_classification WHERE mainId=?";
        try {
            pst = DbConnect.getPreparedStatement(q);
            pst.setString(1, mainId);
            rs = pst.executeQuery();
            if(rs.next()){
                MainClassification main = new MainClassification(rs.getString("mainId"), rs.getString("mainClassificationName"));
                return main;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainClassificationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList getAllMainClass() throws SQLException{
        con = DbConnect.getConnection();
        String q = "SELECT * FROM main_classification";
        try {
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            
           ArrayList<MainClassification> l = new ArrayList<>();
            while(rs.next()){
                MainClassification m = extractMainClassification(rs);
                l.add(m);
            }
            
            return l;
            
        } catch (SQLException e) {
            System.out.println(e);
        }
      return null;  
    }
    public ArrayList searchMainClass(String mainClassification) throws SQLException{
        con = DbConnect.getConnection();
        String q = "SELECT * FROM main_classification WHERE mainClassificationName=?";
        try {
            pst = con.prepareStatement(q);
            pst.setString(1,mainClassification);
            rs = pst.executeQuery();
            
           ArrayList<MainClassification> l = new ArrayList<>();
            while(rs.next()){
                MainClassification m = extractMainClassification(rs);
                l.add(m);
            }
            
            return l;
            
        } catch (SQLException e) {
            System.out.println(e);
        }
      return null;  
    }
    
    public boolean addMainClassification(MainClassification mcl) throws SQLException{
        con = DbConnect.getConnection();
        String q = "INSERT INTO main_classification VALUES (?,?)";
        
        try {
            pst = con.prepareStatement(q);
            
            
            pst.setString(1,mcl.getMid());
            pst.setString(2,mcl.getMname());

           int i = pst.executeUpdate(); 
           if(i==1){
               return true;
           }
           
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public boolean editMainClassification(MainClassification nw) throws SQLException{
        con = DbConnect.getConnection();
        String q = "UPDATE main_classification SET  mainClassificationName=? WHERE mainId=? ";
        String q1 = "SELECT * FROM sub_classification WHERE mainId=?";
        try {
            pst = con.prepareStatement(q1);
            pst.setString(1, nw.getMid());
            rs=pst.executeQuery();
            if(!rs.next()){
                pst = con.prepareStatement(q);
            
                pst.setString(1,nw.getMname());
                pst.setString(2,nw.getMid());
            
            
                int i = pst.executeUpdate(); 
           
                if(i==1){
                    return true;
                }
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteMainClassification(MainClassification nw) throws SQLException{
        con = DbConnect.getConnection();
        String q = "DELETE FROM main_classification WHERE mainId=?";
        
        String q1 = "SELECT * FROM sub_classification WHERE mainId=?";
        try {
            pst = con.prepareStatement(q1);
            pst.setString(1, nw.getMid());
            rs=pst.executeQuery();
            if(!rs.next()){
                pst = con.prepareStatement(q);
            
                
                pst.setString(1,nw.getMid());
            
            
                int i = pst.executeUpdate(); 
           
                if(i==1){
                    return true;
                }
            }
           
        }  catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
