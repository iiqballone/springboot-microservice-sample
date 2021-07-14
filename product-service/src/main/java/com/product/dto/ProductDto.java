package com.product.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {

	private Long id;
	private String name;
	private String country;
	private String logo;
	private String slogan;
	private String head_quaters;
	private String website;
	private String established;
	private List<ProductReviewDto> reviews;

}
