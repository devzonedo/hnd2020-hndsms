/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author devzo
 */
public class DBConnection {
    
    
    public Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hndstudb", "root", "123");
              System.out.println("db connected");
        } catch (Exception e) {
            System.out.println("Error in db connection");
            e.printStackTrace();
        }
        return con;
    }
    
    
    
    
    public static void main(String[] args) {
        DBConnection myDb  = new DBConnection();
        myDb.getConnection();
    }
    
    
}
