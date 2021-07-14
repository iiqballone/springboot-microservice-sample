package com.review.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.review.entity.ProductReview;

@Repository
public interface ReviewRepository extends CrudRepository<ProductReview, Long> {

	public List<ProductReview> findAllByProductId(String productId);
}
