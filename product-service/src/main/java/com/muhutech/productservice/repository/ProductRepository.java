package com.muhutech.productservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.muhutech.productservice.entity.Product;

@Repository
public class ProductRepository {
	
	@Autowired 
	private DynamoDBMapper mapper;
	
	public Product addProduct(Product product) {
		mapper.save(product);
		return product;
	}
	
	public Product getProductById(String prodId) {
		
		return mapper.load(Product.class, prodId);
	}
	
	public String deleteProduct(String prodId) {
		Product product = mapper.load(Product.class, prodId);
		mapper.delete (product);
		return "product deleted";
	}
	
	public String update (String prodId, Product product) {
		mapper.save(product, new DynamoDBSaveExpression().withExpectedEntry("prodId", new ExpectedAttributeValue(new AttributeValue().withS(prodId))));
		return prodId;
	}			

}
