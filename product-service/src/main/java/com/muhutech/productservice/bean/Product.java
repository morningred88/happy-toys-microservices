package com.muhutech.productservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int prodId=1;
	
	@Column (nullable=false)
	private String name="default";
	
	@Column (nullable=false)
	private String description="default description";
	
	@Column (nullable=false)
	private int catId=2;		
	
	
	public Product() {
		super();
	}
	public Product(int prodId) {
		super();
		this.prodId = prodId;
	}
	public int getProdId() {
		return prodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	

}