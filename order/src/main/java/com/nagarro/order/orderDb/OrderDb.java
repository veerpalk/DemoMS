package com.nagarro.order.orderDb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.order.entity.Order;
import com.nagarro.order.entity.OrderedBooks;
import com.nagarro.order.enums.OrderStatus;

@Component
public class OrderDb {

	private List<OrderedBooks> orderedBooks = new ArrayList<OrderedBooks>() {
		{
			add(new OrderedBooks("1", "1", 4));
		}
	};

	private List<Order> orders = new ArrayList<Order>() {
		{
			add(new Order("1", "1", LocalDate.of(2020, 8, 23), OrderStatus.ORDERED, orderedBooks));
		}
	};

	public void addOrder(Order order) {
		this.orders.add(order);
	}

	public List<Order> getAllOrders() {
		return this.orders;

	}

	public void deleteOrder(Order order) {
		this.orders.remove(order);
	}

}
