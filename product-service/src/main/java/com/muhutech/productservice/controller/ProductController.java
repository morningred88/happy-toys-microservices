package com.muhutech.productservice.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhutech.productservice.bean.Product;


@RestController
public class ProductController {
	
	@RequestMapping("/product/{prodId}")
	public Product retrieveProduct(@PathVariable int prodId) {
		
		Product product = new Product(prodId);		
		
		
		return product;		
		
	}

}