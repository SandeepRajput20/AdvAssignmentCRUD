package com.AdvanceCRUD.sqlconnection;

import java.sql.*;

public class sqlconnection {
    static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///advancehotwax", "root", "root");
            if (con == null) {
                System.out.println("Connection failed");
            } else {
                System.out.println("Connection successful");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
