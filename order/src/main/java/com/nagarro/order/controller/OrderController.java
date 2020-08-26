package com.nagarro.order.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.order.entity.Order;
import com.nagarro.order.enums.OrderStatus;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

	@GetMapping("")
	public List<Order> getOrder(@RequestParam String userId) {
		return null;

	}

	@GetMapping("/all")
	public List<Order> getAllOrders() {
		return null;

	}

	@PutMapping("")
	public void updateOrder(@RequestParam String orderId, @RequestParam OrderStatus status) {

	}

	@PostMapping("")
	public void addOrder(@RequestBody Order order) {
	}

}
