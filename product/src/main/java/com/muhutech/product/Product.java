package com.muhutech.product;

public class Product {
	private int prodId=1;
	private String name="default";
	private String description="default description";
	private int catId=2;
	
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