package com.review.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.dto.ProductReviewDto;
import com.review.entity.ProductReview;
import com.review.repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;

	public List<ProductReviewDto> fetchReviews(String productId) {
		List<ProductReview> productReviews = reviewRepository.findAllByProductId(productId);
		int averageReviewScore = productReviews.stream().map(e -> e.getRating()).reduce(0, Integer::sum)
				/ productReviews.size();
		return Arrays.asList(ProductReviewDto.builder().productId(productId+"").averageReviewScore(averageReviewScore + "")
				.noOfReviews(productReviews.size()).build());
	}
}
