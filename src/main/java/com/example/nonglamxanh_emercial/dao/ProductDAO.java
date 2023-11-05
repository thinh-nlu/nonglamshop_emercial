package com.example.nonglamxanh_emercial.dao;

import com.example.nonglamxanh_emercial.helper.DBConnection;
import com.example.nonglamxanh_emercial.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private Connection con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;

    public ProductDAO() {
    }

    public List<Product> getAllProduct() throws SQLException, ClassNotFoundException {
        List<Product> list = new ArrayList<>();
        con = DBConnection.getConnection();
        query = "select * from products";

        ps = this.con.prepareStatement(query);

        rs = ps.executeQuery();

        while (rs.next()) {
            list.add(new Product(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6),
                    rs.getString(7)));
        }

        return list;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductDAO dao = new ProductDAO();
        System.out.println(dao.getAllProduct());
    }
}
