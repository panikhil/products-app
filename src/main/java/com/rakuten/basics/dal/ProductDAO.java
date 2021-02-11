package com.rakuten.basics.dal;

import java.util.List;

import com.rakuten.basics.domain.Product;

public interface ProductDAO {
	
	public Product save(Product toBeSaved);
	public Product findById(int id);
	public List<Product> findAll();
	public void deleteById(int id);

}