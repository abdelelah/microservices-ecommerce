package com.abdelelahr.spring.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.abdelelahr.spring.model.Product;

public interface ProductDaoRepository extends PagingAndSortingRepository<Product, Long> {

	List<Product> findAll();
	
}
