package com.oms.microservices.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="order-item-service" , url="localhost:8400")
public interface OrderItemServiceProxy {

	@GetMapping("/order-item/prodcutCode/{prodcutCode}")
	public double getOrder(@PathVariable String prodcutCode);
}
