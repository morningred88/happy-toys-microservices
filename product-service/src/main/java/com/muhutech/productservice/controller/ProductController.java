package com.muhutech.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.muhutech.productservice.entity.Product;
import com.muhutech.productservice.repository.ProductRepository;


@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

    
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") String prodId) {
						
	return productRepository.getProductById(prodId);		
		
	}


	@PostMapping(value = "/product")
	public Product saveProduct(@RequestBody Product product) {

		return productRepository.addProduct(product);

	}
	
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable("id") String prodId) {
		
		return productRepository.deleteProduct(prodId);
		
	}
	
	@PutMapping("/product/{id}")
	public String updateProduct(@PathVariable("id") String prodId, @RequestBody Product product) {
		
		return productRepository.update(prodId, product);
		
		
	}


}