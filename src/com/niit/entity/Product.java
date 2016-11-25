package com.niit.entity;

public class Product {
	
	public Product(int id, String name, String brand, String  category, String description, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
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




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	@Override
	public String toString() {
		
		return "product [id: " + id +
				", name: " + name +
				", brand: " + brand +
				", category: " + category +
				", description: " + description +
				", price: " + price +
				", quantity: " + quantity + "]";
	}




	private int id;
	private String name;
	private String brand;
	private String category;
	private String description;
	private double price;
	private int quantity;
	
}