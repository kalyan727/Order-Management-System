package com.oms.microservices.orderitemservice.bean;

import javax.persistence.*;

@Entity(name="order_item")
public class OrderItem {

	@Id
	private int id;
	@Column(name="product_code")
	private int productCode;
	private double price;
	private int quantity;
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public OrderItem() {
		
	}

	public OrderItem(int id, int productCode, double price, int quantity) {
		super();
		this.id = id;
		this.price = price;
		this.productCode = productCode;
		this.quantity = quantity;
	}
	
}
