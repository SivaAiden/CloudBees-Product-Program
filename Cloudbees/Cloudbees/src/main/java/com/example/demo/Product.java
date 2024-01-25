package com.example.demo;

public class Product {
    private Long productId;
    private String name;
    private String description;
    private double price;
    private int quantityAvailable;
    
    
	public Product(Long productId, String name, String description, double price, int quantityAvailable) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantityAvailable = quantityAvailable;
	}


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantityAvailable() {
		return quantityAvailable;
	}


	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	
    
}
