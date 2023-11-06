package com.example.nonglamxanh_emercial.servlet;

import com.example.nonglamxanh_emercial.dao.ProductDAO;
import com.example.nonglamxanh_emercial.model.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/insert-product")
@MultipartConfig
public class InsertProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String title = req.getParameter("product_title");
            String unit = req.getParameter("unit");
            String productPrice = req.getParameter("product_price");
            String productKeyword = req.getParameter("product_keyword");
            String productCategory = req.getParameter("product_category");
            String productImage = req.getParameter("productImage");
            Part part = req.getPart("product_image");
            String fileName = part.getSubmittedFileName();

            Product product = new Product(title,fileName,productPrice,unit,productCategory,productKeyword,"active");

            ProductDAO dao = new ProductDAO();
            boolean isAdd = dao.insertProduct(product);

            HttpSession session = req.getSession();
            if (isAdd) {
                session.setAttribute("success","Thêm sản phẩm thành công");
                resp.sendRedirect("admin/insert-product.jsp");
            } else {
                session.setAttribute("failed","Thêm sản phẩm thất bại");
                resp.sendRedirect("admin/insert-product.jsp");
            }

            System.out.println(product);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
