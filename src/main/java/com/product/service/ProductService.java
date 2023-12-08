package com.product.service;

import java.util.List;

import com.product.dto.ProductDTO;

public interface ProductService {
	public ProductDTO createProduct(ProductDTO productdto);
	public List<ProductDTO> viewAllProduct();
	public ProductDTO updateProduct(int productid, ProductDTO productdto);
	public boolean deleteProduct(int productid);
	

}
