package com.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.review.dto.ProductReviewDto;
import com.review.service.ReviewService;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;

	@GetMapping("/{productId}")
	public ResponseEntity<List<ProductReviewDto>> getProducts(@PathVariable("productId") String productId) {
		return new ResponseEntity<List<ProductReviewDto>>(reviewService.fetchReviews(productId), HttpStatus.OK);
	}
}
