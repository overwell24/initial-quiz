package com.initialquiz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    public static Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;
        try {
            String dbURL = "jdbc:mysql://localhost:3306/initial_quiz";
            String dbID = "root";
            String dbPassword = "mysql1234";
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("DB Connect Success");
        return conn;
    }
    
}
