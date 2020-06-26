package com.oms.microservices.orderitemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.microservices.orderitemservice.bean.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

	public OrderItem findbyProductCode(int productCode);
}
