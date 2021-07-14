package com.product.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductReviewDto {
	
	private String productId;
	private String averageReviewScore;
	private int noOfReviews;
	
}
