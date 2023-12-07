package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.ProductDTO;
import com.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
	ProductServiceImpl serviceimpl;

	@PostMapping
	public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productdto) {
		serviceimpl = new ProductServiceImpl();
		productdto = serviceimpl.createProduct(productdto);
		return ResponseEntity.status(HttpStatus.CREATED).body(productdto);

	}

}
