package com.samples.domain;

public class Product {
	
	public Product(){
	}
	
	public Product(int productId, String price, String productName) {
		super();
		ProductId = productId;
		this.price = price;
		ProductName = productName;
	}

	private int ProductId;
	private String price;
	private String ProductName;
	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", price=" + price + ", ProductName=" + ProductName + "]";
	}
	
	

}
