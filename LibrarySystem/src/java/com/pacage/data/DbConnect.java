/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacage.data;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import com.mysql.cj.jdbc.Driver;
/**
 *
 * @author pasindu
 */
public class DbConnect {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/library_system?useSSL=false";

    static final String USER = "root";
    static final String PASS = "manager";
    public static Connection getConnection() throws SQLException{
         Connection con = null;
    try {
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(DB_URL,USER,PASS);
            
    } catch (Exception ex) {

        Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
    }
    return con;
    }
    public static PreparedStatement getPreparedStatement(String sql) throws SQLException{
        Connection con = getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        return pst;
    }
}
 
