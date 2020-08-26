package com.nagarro.cart.entity;

public class Cart {

	private String id;
	private String userId;
	private String bookId;
	private int quatity;

	public Cart(String id, String userId, String bookId, int quatity) {
		this.id = id;
		this.userId = userId;
		this.bookId = bookId;
		this.quatity = quatity;
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

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

}
