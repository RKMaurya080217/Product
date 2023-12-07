package com.service;

import java.util.List;

import com.dao.ProductDAO;
import com.dto.ProductDTO;

public class ProductServiceImpl implements ProductService {
	ProductDAO productdao;

	public ProductDTO createProduct(ProductDTO productdto) {
		productdao = new ProductDAO();
		productdto = productdao.addProduct(productdto);
		return productdto;
	}

	@Override
	public List<ProductDTO> viewAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO updateProduct(int productid, ProductDTO productdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProduct(int productid) {
		// TODO Auto-generated method stub
		return false;
	}

}
