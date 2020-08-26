package com.nagarro.order.entity;

public class OrderedBooks {

	private String id;
	private String userId;
	private int quantity;
	
	
	public OrderedBooks(String id, String userId, int quantity) {
		super();
		this.id = id;
		this.userId = userId;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
