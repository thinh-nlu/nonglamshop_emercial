package com.example.nonglamxanh_emercial.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    private Connection con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;

    public UserDAO(Connection con) {
        this.con = con;
    }

    public int userRegister(String username,String email, String password, String contact, String isAdmin) {
        int rowCount = 0;

        try {
            query = "insert into users(username,email,password,contact,isAdmin) values(?,?,?,?,?)";
            ps = this.con.prepareStatement(query);

            ps.setString(1,username);
            ps.setString(2,email);
            ps.setString(3,password);
            ps.setString(4,contact);
            ps.setString(5,isAdmin);

            rowCount = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowCount;
    }
}
