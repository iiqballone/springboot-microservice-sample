package com.product.config;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.product.dto.ProductReviewDto;

@FeignClient(value = "review-service")
public interface ReviewClient {

	@GetMapping("/api/v1/review/{productId}")
	ResponseEntity<List<ProductReviewDto>> getReviews(@PathVariable("productId") String productId);

}
