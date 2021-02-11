package com.rakuten.basics.service;

import java.util.List;

import com.rakuten.basics.domain.Review;

public interface ReviewService {

	Review addReviewToProduct(Review r, int productId);

	Review findById(int id);

	List<Review> findByProduct_Id(int pid);

}