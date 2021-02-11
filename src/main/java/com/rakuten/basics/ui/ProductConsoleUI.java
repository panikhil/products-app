package com.rakuten.basics.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import com.rakuten.basics.domain.Product;
import com.rakuten.basics.service.ProductService;
import com.rakuten.basics.service.ProductServiceImpl;
@Component
public class ProductConsoleUI {
	
	ProductService service ;//= new ProductServiceImpl();
	@Autowired
	public void setService(ProductService service) {
		this.service = service;
	//this is done for making it eligible for DI dependency injection
		//now will inform spring framework about the Beans like in this case it si ProductServiceImpl() class
		
	}
	
	public void createProductWithUI() {
		try(Scanner kb = new Scanner(System.in)){
			System.out.println("Enter a name:");
			String name = kb.nextLine();
			System.out.println("Enter a price:");
			float price = Float.parseFloat(kb.nextLine());
			System.out.println("Enter a QoH:");
			int qoh = Integer.parseInt(kb.nextLine());
			
			
			Product toBeCreated = new Product(name, price, qoh);
			int id = service.createNewProduct(toBeCreated);
			System.out.println("Created Product with ID: "+id);
		}
	}

}