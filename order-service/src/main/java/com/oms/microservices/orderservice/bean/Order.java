package com.oms.microservices.orderservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="orders")
public class Order {

	@Id
	private int id;
	@Column(name="customer_name")
	private String customerName;
	private String address;
	@Column(name="order_item")
	private int orderItem;
	private double amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Order() {
		
	}
	public int getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(int orderItem) {
		this.orderItem = orderItem;
	}
	public Order(int id, String customerName, String address, int orderItem, double amount) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.address = address;
		this.orderItem = orderItem;
		this.amount = amount;
	}
	
}
