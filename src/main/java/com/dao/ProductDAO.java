package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dto.ProductDTO;

public class ProductDAO {
	private String insert = "INSERT INTO product (id, name, description, price, quantity, status) VALUES (?, ?, ?, ?, ?, ?)";
	private String fetch = "SELECT * FROM productdetail";
	private String fetchcompleted = "SELECT * FROM productdetail where status='1'";
	private String update;
	private String delete;
	private int rowsAffected = 0;
	PreparedStatement pstmt;

	public ProductDTO addProduct(ProductDTO productdto) {
		try {
			pstmt = getConnection().prepareStatement(insert);

			pstmt.setInt(1, productdto.getProductid());
			pstmt.setString(2, productdto.getProductname());
			pstmt.setString(3, productdto.getProductdesc());
			pstmt.setInt(4, productdto.getProductprice());
			pstmt.setInt(5, productdto.getProductquantity());
			pstmt.setBoolean(6, productdto.isProductstock());

			rowsAffected = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (rowsAffected > 0) {
			System.out.println(productdto.getProductname() + " Task added successfully!");
			return productdto;
		} else {
			System.out.println(productdto.getProductname() + " Failed to add task.");
			return null;
		}
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydocument", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
