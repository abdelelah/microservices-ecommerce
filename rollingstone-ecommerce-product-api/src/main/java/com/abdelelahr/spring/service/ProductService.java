package com.abdelelahr.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.abdelelahr.spring.model.Product;



public interface ProductService {

	Product save(Product product);
  Optional<Product> get(long id);
   Page<Product> getProductsByPage(Integer pageNumber, Integer pageSize );
   void update(long id,Product product);
   void delete(long id);
}
