package com.rakuten.basics.dal;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rakuten.basics.domain.Product;
//import org.springframework.data.repository.Repository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
 public List<Product> findByPrice(float p);
 public List<Product> findByPriceLessThan(float p);
 public List<Product> findByNameLike(String s); //method naming convention by springdata
  
  @Query("select p from Product as p where p.qoh=:q")
	public List<Product> myComplexQuery(@Param("q") int i);
 
 
}
