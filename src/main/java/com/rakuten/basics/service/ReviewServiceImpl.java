package com.rakuten.basics.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.basics.dal.ProductDAO;
import com.rakuten.basics.dal.ReviewDAO;
import com.rakuten.basics.domain.Product;
import com.rakuten.basics.domain.Review;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService  {
	@Autowired
	ReviewDAO reviewDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Override
	public Review addReviewToProduct(Review r,int productId) {
		
		Product p = productDAO.findById(productId);
		r.setProduct(p);
		return reviewDAO.save(r);
		
	}

	@Override
	public Review findById(int id) {
		return reviewDAO.findById(id);
	}

	@Override
	public List<Review> findByProduct_Id(int pid) {
		return reviewDAO.findByProduct_Id(pid);
	}
	

}
