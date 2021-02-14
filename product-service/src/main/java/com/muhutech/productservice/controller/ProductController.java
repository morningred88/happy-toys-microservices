package com.muhutech.productservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhutech.productservice.bean.Product;
import com.muhutech.productservice.configuration.Configuration;


@RestController
public class ProductController {
	
	@Autowired
	private Configuration configuration;
	
	@RequestMapping("/product/")
	public Product retrieveProduct() {
		
		int prodId = configuration.getProdId();
		
		Product product = new Product(prodId);		
		
		return product;		
		
	}
	
//public Product retrieveProduct(@PathVariable int prodId) {
//		
//		Product product = new Product(prodId);		
//		
//		
//		return product;		
//		
//	}

}