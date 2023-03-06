package com.example.demo_jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUsers {
    private static final String jdbcURL = "jdbc:mysql://localhost:3306/demo_jdbc?useSSL=false";
    private static final String jdbcUsername = "root";
    private static final String jdbcPassword = "Nguyenluc97";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
}
