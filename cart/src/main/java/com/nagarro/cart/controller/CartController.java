package com.nagarro.cart.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.cart.entity.Cart;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

	@GetMapping("")
	public List<Cart> getUserCart(@RequestParam String userId) {
		return null;
	}

	@PostMapping("")
	public void addToCart(@RequestBody Cart cart) {

	}

	@DeleteMapping("")
	public void removeFromcart(@RequestParam String userId, @RequestParam String bookId) {

	}

	@PutMapping("")
	public void updateCartQty(@RequestParam String userId, @RequestBody Cart cartItem, @RequestParam int qty) {

	}

	@DeleteMapping("/clear")
	public void clearCart(@RequestParam String userId) {

	}

}
