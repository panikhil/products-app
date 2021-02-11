//package com.rakuten.basics;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.rakuten.basics.dal.ProductDAO;
//import com.rakuten.basics.dal.ProductDAOInMemImpl;
//import com.rakuten.basics.service.ProductService;
//import com.rakuten.basics.service.ProductServiceImpl;
//import com.rakuten.basics.ui.ProductConsoleUI;
//
//@Configuration
//public class ProductsAppConfiguration {
//    @Bean //for telling spring that it is a Bean
//	public ProductDAO daoObj() {
//	  ProductDAOInMemImpl dao = new ProductDAOInMemImpl();
//	  return dao;
//  }
//    @Bean
//	public ProductService serviceObj() {
//		ProductServiceImpl service = new ProductServiceImpl();
//		service.setDao(daoObj());
//		return service;
//	}
//	
//	@Bean
//	public ProductConsoleUI uiObj() {
//		ProductConsoleUI ui = new ProductConsoleUI();
//		ui.setService(serviceObj());
//		return ui;
//	}
//}
