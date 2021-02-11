  package com.rakuten.basics.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.basics.domain.Product;
import com.rakuten.basics.domain.Review;
import com.rakuten.basics.service.ProductService;
import com.rakuten.basics.service.ReviewService;

@CrossOrigin
@RestController
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;
	
	@Autowired
	ProductService productService;
	
	@GetMapping("products/{idPathVariable}/reviews")
	public ResponseEntity getAllReviewsForProduct(@PathVariable("idPathVariable") int id){
		Product p = productService.findById(id);
		if(p==null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		List<Review> reviews = reviewService.findByProduct_Id(id);
		return new ResponseEntity<>(reviews,HttpStatus.OK);
	}
	
	@GetMapping("products/{productId}/reviews/{reviewId}")
	public ResponseEntity getAllReviewsForProduct(@PathVariable("productId") int pid,@PathVariable("reviewId") int rid){
		Product p = productService.findById(pid);
		Review r = reviewService.findById(rid);
		if(p==null || r==null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(r,HttpStatus.OK);
	}
	
	@PostMapping("products/{idPathVariable}/reviews")
	public ResponseEntity addReviewForProduct( Review review,@PathVariable("idPathVariable") int id){
		Product p = productService.findById(id);
		if(p==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		System.out.println(review+" "+id);
		Review added = reviewService.addReviewToProduct(review, id);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(URI.create("/products/"+id+"/reviews"+added.getId()));
		return new ResponseEntity<>(added,headers,HttpStatus.CREATED);
	}
	
}

