package com.nagarro.order.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.order.entity.Order;
import com.nagarro.order.enums.OrderStatus;
import com.nagarro.order.orderDb.OrderDb;

@Component
public class OrderRepository {

	@Autowired
	OrderDb orderDb;

	public List<Order> getOrder(@RequestParam String userId) {
		return orderDb.getAllOrders().stream().filter(order -> order.getUserId().equals(userId))
				.collect(Collectors.toList());
	}

	public List<Order> getAllOrders() {
		return orderDb.getAllOrders();

	}

	public Order updateOrder(@RequestParam String orderId, @RequestParam OrderStatus status) {

		for (Order order : orderDb.getAllOrders()) {
			if (order.getId().equals(orderId)) {
				order.setStatus(status);
				return order;
			}
		}
		return null;
	}

	public void addOrder(@RequestBody Order order) {
		orderDb.addOrder(order);

	}

}
