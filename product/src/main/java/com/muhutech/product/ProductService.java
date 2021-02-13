package com.muhutech.product;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductService {
	
	@RequestMapping("/product/{prodId}")
	public Product getProduct(@PathVariable int prodId) {
		
		return new Product(prodId);		
		
	}
	

}
