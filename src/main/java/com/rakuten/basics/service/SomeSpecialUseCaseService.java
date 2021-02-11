package com.rakuten.basics.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rakuten.basics.dal.ProductDAO;

@Service
public class SomeSpecialUseCaseService {
 @Autowired
 @Qualifier("productDAOInMemImpl")
 ProductDAO dao;
 @PostConstruct 
 public void playWithDAO(){
	 System.out.println("{{{type of Dao : "+ dao.getClass().getName()+ "}}}");
 }
 
}
