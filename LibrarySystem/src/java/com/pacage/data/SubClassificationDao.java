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
import com.pacage.model.SubClassification;
import com.pacage.model.SubSearch;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pasindu
 */
public class SubClassificationDao {

    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection con = null;
    MainClassificationDao mainDao = new MainClassificationDao();

    public SubClassificationDao() {
    }

    private SubClassification extractSubClassification(ResultSet rs) throws SQLException {
        SubClassification sub = new SubClassification();

        sub.setSid(rs.getString("subId"));
        sub.setSname(rs.getString("subClassificationName"));
//        sub.setMid(rs.getString("mid"));

        return sub;
    }

    public boolean hasSubClassification(String subId) throws SQLException {

        String sql = "SELECT * FROM sub_classification WHERE subId = ?";
        pst = DbConnect.getPreparedStatement(sql);
        rs = pst.executeQuery();
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public ArrayList<ArrayList<String>> searchSubClass(String selection, String val) throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM sub_classification WHERE " + selection + "=?";
        String q1 = "SELECT * FROM main_classification WHERE mainId=?";
//        String q1 = "SELECT * FROM sub_classification WHERE mname=?";
        try {

            pst = con.prepareStatement(q);
            pst.setString(1, val);
            rs = pst.executeQuery();
            ArrayList<ArrayList<String>> sub = new ArrayList<>();

            while (rs.next()) {
                ArrayList<String> temp = new ArrayList<>();
                String mainId = rs.getString("mainId");
                String subId = rs.getString("subId");
                String subClassificationName = rs.getString("subClassificationName");
                temp.add(subId);
                temp.add(subClassificationName);
                try {
                    Connection con1 = DbConnect.getConnection();
                    PreparedStatement pst1 = con1.prepareStatement(q1);
                    pst1.setString(1, mainId);
                    ResultSet rs1 = pst1.executeQuery();
                    if (rs1.next()) {
                        String mainClassificationName = rs1.getString("mainClassificationName");
                        temp.add(mainClassificationName);
                        temp.add(mainId);
                    }

                    sub.add(temp);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            return sub;

        } catch (SQLException e) {
//            System.out.println(e);
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<ArrayList<String>> getAllSubClass() throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM sub_classification";
        String q1 = "SELECT * FROM main_classification WHERE mainId=?";
//        String q1 = "SELECT * FROM sub_classification WHERE mname=?";
        try {

            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            ArrayList<ArrayList<String>> sub = new ArrayList<>();

            while (rs.next()) {
                ArrayList<String> temp = new ArrayList<>();
                String mainId = rs.getString("mainId");
                String subId = rs.getString("subId");
                String subClassificationName = rs.getString("subClassificationName");
                temp.add(subId);
                temp.add(subClassificationName);
                try {
                    Connection con1 = DbConnect.getConnection();
                    PreparedStatement pst1 = con1.prepareStatement(q1);
                    pst1.setString(1, mainId);
                    ResultSet rs1 = pst1.executeQuery();
                    if (rs1.next()) {
                        String mainClassificationName = rs1.getString("mainClassificationName");
                        temp.add(mainClassificationName);
                        temp.add(mainId);
                    }

                    sub.add(temp);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            return sub;

        } catch (SQLException e) {
//            System.out.println(e);
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<SubClassification> getAllSubClassOfMainClass(String mainId) throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM sub_classification WHERE mainId=?";
//        String q1 = "SELECT * FROM sub_classification WHERE mname=?";
        try {

            pst = con.prepareStatement(q);

            pst.setString(1, mainId);
            rs = pst.executeQuery();

            ArrayList<SubClassification> l = new ArrayList<>();
            while (rs.next()) {
                SubClassification m = extractSubClassification(rs);
                l.add(m);
            }

            return l;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<SubSearch> getAllSubClassifications() throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM sub_classification";
        try {

            pst = con.prepareStatement(q);
            rs = pst.executeQuery();

            ArrayList<SubSearch> list = new ArrayList<>();
            while (rs.next()) {
                SubClassification sub = extractSubClassification(rs);
                String mainId = rs.getString("mainId");
                MainClassification mn = mainDao.getMainClassification(mainId);
                SubSearch subClassifications = new SubSearch(sub, mn);
                list.add(subClassifications);
            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getLogger(MainClassificationDao.class.getName()).log(Level.SEVERE, null, e);

        }
        return null;
    }

    public boolean addSubClassification(String mid, String sid, String scl) throws SQLException {
        con = DbConnect.getConnection();
        String q = "INSERT INTO sub_classification VALUES (?,?,?)";

        try {

            pst = con.prepareStatement(q);

            pst.setString(1, sid);
            pst.setString(2, scl);
            pst.setString(3, mid);

            int i = pst.executeUpdate();
            if (i == 1) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean editSubClassification(String mainId, String subId, String subName) throws SQLException {
        con = DbConnect.getConnection();
        String q = "UPDATE sub_classification SET  mainId=?, subClassificationName=? WHERE  subId=? ";

        try {
            pst = con.prepareStatement(q);

            pst.setString(1, mainId);
            pst.setString(2, subName);
            pst.setString(3, subId);

            int i = pst.executeUpdate();

            if (i == 1) {
                return true;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteSubClassification(String sid) throws SQLException {
        con = DbConnect.getConnection();
        String q = "DELETE FROM sub_classification WHERE subId=?";
        String q1 = "SELECT * FROM book_sub WHERE subId=?";

        try {
            pst = con.prepareStatement(q1);
            pst.setString(1, sid);
            rs = pst.executeQuery();
            if (!rs.next()) {
                pst = con.prepareStatement(q);
                pst.setString(1, sid);
                int i = pst.executeUpdate();

                if (i == 1) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
