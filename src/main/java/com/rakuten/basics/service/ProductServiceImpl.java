package com.rakuten.basics.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rakuten.basics.dal.ProductDAO;
import com.rakuten.basics.dal.ProductDAOInMemImpl;
import com.rakuten.basics.domain.Product;
@Transactional
@Service
public class ProductServiceImpl implements ProductService {

	ProductDAO dao; // = new ProductDAOInMemImpl();
	@Autowired
	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public int createNewProduct(Product toBeCreated) {
		if(toBeCreated.getPrice() * toBeCreated.getQoh() >= 10000) {
			Product created = dao.save(toBeCreated);
			return created.getId();
		}else {
			throw new IllegalArgumentException("The product passed to create is not worth 10k");
		}
	}

	@Override
	public void removeExisting(int id) {
		Product existing = dao.findById(id);
		
		if(existing == null) {
			throw new IllegalArgumentException("product with id "+id+" not found!");
		}
		if(existing.getPrice() * existing.getQoh() >= 100000) {
			throw new IllegalStateException("Can't delete product when stock >= 100k");
		}
		dao.deleteById(id);
		
	}

	@Override
	public List<Product> findAll() {
		return dao.findAll();
	}

	@Override
	public Product findById(int id) {
		return dao.findById(id);
	}

}
