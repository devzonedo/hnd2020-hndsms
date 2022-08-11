/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sms.businesslogic.student;

import com.sms.entity.UserBean;
import com.sms.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author devzo
 */
public class StudentLogic {

    public boolean addStudent(UserBean stu) {
        Connection con = null;
        boolean flag = false;
        try {
            con = new DBConnection().getConnection();
            String sql = " INSERT INTO tbl_user\n"
                    + "            (first_name,\n"
                    + "             last_name,\n"
                    + "             nic,\n"
                    + "             gender,\n"
                    + "             address,\n"
                    + "             username,\n"
                    + "             pword,\n"
                    + "             role,\n"
                    + "             status_code,\n"
                    + "             couse_code)\n"
                    + "VALUES (?,\n"
                    + "        ?,\n"
                    + "        ?,\n"
                    + "        ?,\n"
                    + "        ?,\n"
                    + "        ?,\n"
                    + "        ?,\n"
                    + "        ?,\n"
                    + "        ?,\n"
                    + "        ?); ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, stu.getFirst_name());
            ps.setString(2, stu.getLast_name());
            ps.setString(3, stu.getNic());
            ps.setString(4, stu.getGender());
            ps.setString(5, stu.getAddress());
            ps.setString(6, stu.getUsername());
            ps.setString(7, stu.getUsername());
            ps.setString(8, stu.getRole());
            ps.setString(9, "ACTIVE");
            ps.setString(10, stu.getCouse_code());
            
            System.out.println("ps:" + ps);
            
           if(ps.executeUpdate() == 1){
           flag = true;
           }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;

    }

    
    
    
    
    
}
