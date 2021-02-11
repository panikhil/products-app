package com.rakuten.basics.dal;

import java.util.List;

import com.rakuten.basics.domain.Review;

public interface ReviewDAO {

	Review save(Review r);

	Review findById(int id);

	List<Review> findByProduct_Id(int pid);

}