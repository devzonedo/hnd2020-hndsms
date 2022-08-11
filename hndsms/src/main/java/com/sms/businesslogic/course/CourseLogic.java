/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sms.businesslogic.course;

import com.sms.entity.SubjectBean;
import com.sms.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devzo
 */
public class CourseLogic {

    
    
    
    
    public List<SubjectBean> getSubjectList(String coursecode) {
        Connection con = null;

        List<SubjectBean> subjectList = new ArrayList<SubjectBean>();

        try {
            con = new DBConnection().getConnection();
            String sql = "SELECT A.subject_code, A.subject_name , B.course_code,B.course_name FROM tbl_subject AS A\n"
                    + "INNER JOIN tbl_course AS B\n"
                    + "ON A.course_code = B.course_code\n"
                    + "WHERE B.course_code = ?  ;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, coursecode);

            System.out.println("ps:" + ps);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SubjectBean sb = new SubjectBean();
                sb.setSubject_code(rs.getString("subject_code"));
                sb.setSubject_name(rs.getString("subject_name"));
                sb.setCourse_code(rs.getString("course_code"));
                subjectList.add(sb);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return subjectList;
    }

}
