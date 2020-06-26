package com.oms.microservices.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.oms.microservices.orderservice.OrderItemServiceProxy;
import com.oms.microservices.orderservice.bean.Order;
import com.oms.microservices.orderservice.repository.OrderRepository;

@RestController
public class OrderController {
	//localhost:8000/productId/1001/quantity/2
	
	@Autowired
	OrderItemServiceProxy proxy;
	
	@Autowired
	OrderRepository repository;
	
	@PostMapping("/order/createOrder")
	public String createOrder(@RequestBody Order order) {

		Order orderCreated = repository.save(order);
		return "Order has been successfully placed with the code: " + orderCreated.getId();
	}
	
	@GetMapping("/order/{id}/quantity/{quantity}")
	public Order getOrderDetails(@PathVariable String id, @PathVariable String quantity) {
	
		double amount = proxy.getOrder(id);
		Order order = new Order();
		order.setAmount(amount);
		
		return order;
	}
}