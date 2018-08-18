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
import com.pacage.model.subSearch;
import java.util.HashMap;

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

    public ArrayList searchSubClass(String subClassification) throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM sub_classification WHERE subClassificationName=?";
        try {
            pst = con.prepareStatement(q);
            pst.setString(1, subClassification);
            rs = pst.executeQuery();
            
            ArrayList<subSearch> l = new ArrayList<>();
            while (rs.next()) {
                SubClassification m = extractSubClassification(rs);
                String mainId = rs.getString("mainId");
                MainClassification main = new MainClassification();
                main = mainDao.getMainClassification(mainId);
                subSearch newSub = new subSearch(m,main);
                
                l.add(newSub);
            }

            return l;

        } catch (SQLException e) {
            System.out.println(e);
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
    public ArrayList<SubClassification> getAllSubClassifications() throws SQLException {
        con = DbConnect.getConnection();
        String q = "SELECT * FROM sub_classification";
        try {

            pst = con.prepareStatement(q);
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

    public boolean addSubClassification(String mcl, String sid, String scl) throws SQLException {
        con = DbConnect.getConnection();
        String q = "INSERT INTO sub_classification VALUES (?,?,?)";
        String q1 = "SELECT * FROM main_classification WHERE mainClassificationName=?";
        try {
            pst = con.prepareStatement(q1);

            pst.setString(1, mcl);
            rs = pst.executeQuery();

            if (rs.next()) {
                String mid = rs.getString("mainId");

                pst = con.prepareStatement(q);

                pst.setString(1, sid);
                pst.setString(2, scl);
                pst.setString(3, mcl);

                int i = pst.executeUpdate();
                if (i == 1) {
                    return true;
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean editSubClassification(String mcl, String sid, String scl) throws SQLException {
        con = DbConnect.getConnection();
        String q = "UPDATE sub_classification SET  mainId=?, subClassificationName=? WHERE  subId=? ";
        String q1 = "SELECT * FROM main_classification WHERE mname=?";

        try {
            pst = con.prepareStatement(q1);

            pst.setString(1, mcl);
            rs = pst.executeQuery();

            if (rs.next()) {
                String mid = rs.getString("mainId");

                pst = con.prepareStatement(q);

                pst.setString(1, mid);
                pst.setString(2, scl);
                pst.setString(3, sid);

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

    public boolean deleteSubClassification(String sid, String scl) throws SQLException {
        con = DbConnect.getConnection();
        String q = "DELETE FROM sclass WHERE subId=?";
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
