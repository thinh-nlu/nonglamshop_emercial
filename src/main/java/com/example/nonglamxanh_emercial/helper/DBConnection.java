package com.example.nonglamxanh_emercial.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection = null;
    static String url = "jdbc:mysql://localhost:3306/nonglamxanh_shop";
    static String user = "root";
    static String password = "";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("connected");
        } else {
            System.out.println("unconnected");
        }
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println(DBConnection.getConnection());
    }
}
