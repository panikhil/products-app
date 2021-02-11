package com.rakuten.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rakuten.basics.dal.ProductRepository;
import com.rakuten.basics.domain.Product;
import com.rakuten.basics.domain.Review;
import com.rakuten.basics.service.ReviewService;
import com.rakuten.basics.ui.ProductConsoleUI;
@SpringBootApplication
public class ProductsappApplication {

	public static void main(String[] args) {
		//ApplicationContext springContainer = 
				SpringApplication.run(ProductsappApplication.class, args);
		
//		String s = "This is a String";
//		Class c = ProductService.class;
//		ProductConsoleUI ui = springContainer.getBean(ProductConsoleUI.class);
//		ui.createProductWithUI();
		
		//testReviewAssciation(springContainer);
		//testSpringDataRepository(springContainer);
	}
//	private static void testSpringDataRepository(ApplicationContext springContainer) {
//		ProductRepository repo = springContainer.getBean(ProductRepository.class);
//		Product p = new Product("repo", 10000, 10);
//		Product saved = repo.save(p);
//		
//		System.out.println("Saved a product with id: "+saved.getId());
//		
//	}
//	private static void testReviewAssciation(ApplicationContext springContainer) {
//		
//		Review aReview = new Review("self", "very good", 5);
//	
//		ReviewService svc = springContainer.getBean(ReviewService.class);
//		
//		svc.addReviewToProduct(aReview, 1);
//}
	
	
}
