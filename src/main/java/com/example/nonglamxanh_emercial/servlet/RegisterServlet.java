package com.example.nonglamxanh_emercial.servlet;

import com.example.nonglamxanh_emercial.dao.UserDAO;
import com.example.nonglamxanh_emercial.helper.DBConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        Connection con = null;
        try {
            con = DBConnection.getConnection();

            String username = req.getParameter("name");
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            String rePassword = req.getParameter("re_pass");
            String contact = req.getParameter("contact");

            UserDAO dao = new UserDAO(con);

            int rowCount = dao.userRegister(username,email,password,contact,"0");

            if (rowCount > 0) {
                req.setAttribute("status","Tạo tài khoản thành công");
                resp.sendRedirect("login.jsp");
            } else {
                req.setAttribute("status","Tạo tài khoản thất bại");
                req.getRequestDispatcher("registration.jsp").forward(req,resp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
