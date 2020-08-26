package com.nagarro.cart.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.cart.entity.Cart;

@Component
public class CartRepository {

	@Autowired
	CartDB cartDB;

	public List<Cart> getUserCart(@RequestParam String userId) {
		return cartDB.getCartItems().stream().filter(Item -> Item.getUserId().equals(userId))
				.collect(Collectors.toList());
	}

	public void addToCart(@RequestBody Cart cart) {

		cartDB.setCartItem(cart);
	}

	public void removeFromcart(@RequestParam String userId, @RequestParam String bookId) {

		cartDB.getCartItems().removeIf(cart -> cart.getUserId().equals(userId) && cart.getBookId().equals(bookId));
	}

	public void updateCartQty(@RequestParam String userId, @RequestBody Cart cartItem, @RequestParam int qty) {

		cartDB.getCartItems().stream()
				.filter(cart -> cart.getUserId().equals(userId) && cart.getBookId().equals(cartItem.getBookId()))
				.forEach(cart -> cart.setQuatity(qty));
	}

	public void clearCart(@RequestParam String userId) {
		cartDB.getCartItems().removeIf(cart -> cart.getUserId().equals(userId));

	}

}
