package com.muhutech.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muhutech.productservice.bean.Product;
import com.muhutech.productservice.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	
	public Product save(Product product) {
		
		return productRepository.save(product);
	}

}
