package com.muhutech.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.muhutech.productservice.bean.Product;
import com.muhutech.productservice.configuration.Configuration;
import com.muhutech.productservice.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	private Configuration configuration;

	@Autowired
	private ProductService productService;
    
	@RequestMapping("/product")
	public Product retrieveProduct(@PathVariable int prodId) {
		
		Product product = new Product(prodId);		
		
		return product;		
		
	}


	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public Product saveProduct(@RequestBody Product product) {

		return productService.save(product);

	}
	
//	@RequestMapping("/product")
//	public Product retrieveProduct() {
//
//		int prodId = configuration.getProdId();
//
//		Product product = new Product(prodId);
//
//		return product;
//
//	}

}