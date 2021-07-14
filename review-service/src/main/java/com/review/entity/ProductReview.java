package com.review.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductReview {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	private String productId;
	private int rating;
	private String description;

}
