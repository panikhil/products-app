package com.rakuten.basics.web;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import com.rakuten.basics.domain.Product;
import com.rakuten.basics.service.ProductService;

class WrongWayToTest {

	@Test
	void testGetProductById() {
		//AAA
		//Arrange
		ProductController objUnderTest = new ProductController();
		ProductService mockService = Mockito.mock(ProductService.class);
		int id = 1;
		Product returnedByMock = new Product("test", 8272, 12);
		returnedByMock.setId(id);
		
		Mockito.when(mockService.findById(id)).thenReturn(returnedByMock);
		objUnderTest.service = mockService;
		
		//Act
		ResponseEntity<Product> response = objUnderTest.getProductById(id);
		
		//Assert
		assertTrue(response.getBody().getId() == id);
		
	}

}
