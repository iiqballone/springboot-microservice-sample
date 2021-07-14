package com.product.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.product.dto.ProductDto;
import com.product.service.BookClientConfiguration;

@FeignClient(value = "productClient", url = "https://www.adidas.co.uk", configuration = BookClientConfiguration.class)
public interface ProductsClient {

	@GetMapping("/api/products/{product_id}")
	ResponseEntity<ProductDto> getProducts(@PathVariable("product_id") String product_id);

	@GetMapping("/api/products/{product_id}")
	public ProductDto getProductsEntity(@PathVariable("product_id") String product_id);

	@GetMapping("/airlines/{product_id}")
	public ProductDto getAirlines(@PathVariable("product_id") String product_id);

}
