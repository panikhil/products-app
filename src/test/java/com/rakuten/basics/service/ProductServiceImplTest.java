package com.rakuten.basics.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.rakuten.basics.dal.ProductDAOInMemImpl;
import com.rakuten.basics.domain.Product;

class ProductServiceImplTest {

	@Test
	void createNewProduct_Must_Return_Id_When_Product_Value_GTEQ_MinValue() {
		//AAA
		//Arrange
		ProductServiceImpl objUnderTest = new ProductServiceImpl();
		Product argToMethod = new Product("test", 10000, 2);
		ProductDAOInMemImpl testDouble = new ProductDAOInMemImpl();
		objUnderTest.setDao(testDouble);
		//here we are injecting an alternate object for testing as Duck typing
		//Act
		int id = objUnderTest.createNewProduct(argToMethod);
		
		//Assert
		assertTrue(id > 0);
	}
	

}
