package com.example.nonglamxanh_emercial.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

    private Connection con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;

    public UserDao(Connection con) {
        this.con = con;
    }

    public int userRegister(String username,String email, String password, String contact) {
        int rowCount = 0;
        try {
            query = "insert into users(username,email,password,contact) values(?,?,?,?)";
            ps = this.con.prepareStatement(query);

            ps.setString(1,username);
            ps.setString(2,email);
            ps.setString(3,password);
            ps.setString(4,contact);

            rowCount = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowCount;
    }
}
