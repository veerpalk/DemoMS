package com.nagarro.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.cart.entity.Cart;
import com.nagarro.cart.exceptions.DataNotFoundException;
import com.nagarro.cart.repository.CartRepository;
import com.nagarro.enums.ErrorCode;

@Component
public class CartService {

	@Autowired
	CartRepository CartRepository;

	@GetMapping("")
	public List<Cart> getUserCart(@RequestParam String userId) {
		if(CartRepository.getUserCart(userId).isEmpty())
		{
			throw new DataNotFoundException(ErrorCode.NO_CONTENT);
		}
		return CartRepository.getUserCart(userId);
	}

	@PostMapping("")
	public void addToCart(@RequestBody Cart cart) {

		CartRepository.addToCart(cart);
	}

	@DeleteMapping("")
	public void removeFromcart(@RequestParam String userId, @RequestParam String bookId) {
		CartRepository.removeFromcart(userId, bookId);

	}

	@PutMapping("")
	public void updateCartQty(@RequestParam String userId, @RequestBody Cart cartItem, @RequestParam int qty) {

		CartRepository.updateCartQty(userId, cartItem, qty);
	}

	@DeleteMapping("/clear")
	public void clearCart(@RequestParam String userId) {
		CartRepository.clearCart(userId);

	}

}
