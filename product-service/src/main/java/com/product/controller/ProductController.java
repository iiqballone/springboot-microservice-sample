package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.dto.ProductDto;
import com.product.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/{productId}")
	public ResponseEntity<ProductDto> getProducts(@PathVariable("productId") String productId) {
		return new ResponseEntity<ProductDto>(productService.getProductsWithReviews(productId), HttpStatus.OK);
	}
}
