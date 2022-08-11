/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sms.businesslogic.user;

import com.sms.entity.UserBean;
import com.sms.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author devzo
 */
public class UserLogic {

    /**
     * This method does user login,
     */
    public UserBean getLogin(UserBean userbean) {

        Connection con = null;

        try {
            con = new DBConnection().getConnection();
            String sql = "SELECT * FROM tbl_user WHERE username = ? AND pword = ? AND status_code = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userbean.getUsername());
            ps.setString(2, userbean.getPword());
            ps.setString(3, "ACTIVE");

            System.out.println("ps:" + ps);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                userbean.setFirst_name(rs.getString("first_name"));
                userbean.setLast_name(rs.getString("last_name"));
                userbean.setNic(rs.getString("nic"));
                userbean.setRole(rs.getString("role"));
                userbean.setStatus_code(rs.getString("status_code"));
                userbean.setCouse_code(rs.getString("couse_code"));
                userbean.setFlag(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return userbean;
    }

}
