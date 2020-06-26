package com.oms.microservices.orderitemservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.oms.microservices.orderitemservice.OrderNotFoundException;
import com.oms.microservices.orderitemservice.bean.OrderItem;
import com.oms.microservices.orderitemservice.repository.OrderItemRepository;


@RestController
public class OrderItemController {
	
	@Autowired
	OrderItemRepository repository;
	
	@PostMapping("/order-item/createOrderItem")
	public String createOrderItem(@RequestBody OrderItem orderItem) {

		OrderItem item = repository.save(orderItem);
		return "Product has been successfully created with the product code: " + item.getProductCode();
	}
	
	@GetMapping("/order-item/prodcutCode/{prodcutCode}")
	public double getOrder(@PathVariable String productCode) {
		
		OrderItem orderItem = repository.findbyProductCode(Integer.parseInt(productCode));
		
		if(orderItem == null)
			throw new  OrderNotFoundException("product id: "+ productCode);
		
		return orderItem.getPrice();
		
		
	}

}
