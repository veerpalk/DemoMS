package com.nagarro.order.entity;

import java.time.LocalDate;
import java.util.List;

import com.nagarro.order.enums.OrderStatus;

public class Order {

	private String id;
	private String userId;
	private LocalDate createdDate;
	private OrderStatus status;

	private List<OrderedBooks> orderedBooks;

	public Order(String id, String userId, LocalDate createdDate, OrderStatus status, 
			List<OrderedBooks> orderedBooks) {
		super();
		this.id = id;
		this.userId = userId;
		this.createdDate = createdDate;
		this.status = status;
		this.orderedBooks = orderedBooks;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderedBooks> getOrderedBooks() {
		return orderedBooks;
	}

	public void setOrderedBooks(List<OrderedBooks> orderedBooks) {
		this.orderedBooks = orderedBooks;
	}
	
	
	
	
	

}
