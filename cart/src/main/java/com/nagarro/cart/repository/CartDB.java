package com.nagarro.cart.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.cart.entity.Cart;

@Component
public class CartDB {

	List<Cart> cartItems = new ArrayList<Cart>() {
		{
			add(new Cart("1", "1", "1", 3));

		}
	};

	public List<Cart> getCartItems() {
		return cartItems;
	}

	public void setCartItem(Cart cartItem) {
		this.cartItems.add(cartItem);
	}

}
