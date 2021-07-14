package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.config.ProductsClient;
import com.product.config.ReviewClient;
import com.product.dto.ProductDto;

@Service
public class ProductService {

	@Autowired
	private ReviewClient reviewClient;

	@Autowired
	private ProductsClient productsClient;

	public ProductDto getProductsWithReviews(String productId) {
		try {
			ProductDto productDto = productsClient.getProducts(productId).getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ProductDto productDto = productsClient.getProductsEntity(productId);
		productDto.setReviews(reviewClient.getReviews(productId).getBody());
		return productDto;

	}
}
