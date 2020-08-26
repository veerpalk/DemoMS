package com.nagarro.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.order.entity.Order;
import com.nagarro.order.enums.OrderStatus;
import com.nagarro.order.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public List<Order> getOrder(@RequestParam String userId) {
		return orderRepository.getOrder(userId);

	}

	public List<Order> getAllOrders() {
		return orderRepository.getAllOrders();

	}

	public Order updateOrder(@RequestParam String orderId, @RequestParam OrderStatus status) {

		return orderRepository.updateOrder(orderId, status);
	}

	public void addOrder(@RequestBody Order order) {
		orderRepository.addOrder(order);
	}

}
