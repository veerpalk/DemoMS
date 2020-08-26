package com.nagarro.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.account.entity.User;
import com.nagarro.account.service.AccountService;

@RestController(value = "account")
public class AccountController {

	@Autowired
	AccountService accountService;

	@GetMapping("")
	public List<User> getAllUsers() {
		return accountService.getAllUsers();
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") String id) {
		return accountService.getUser(id);
	}

	@PostMapping("")
	public void addUser(@RequestBody User User) {
		accountService.addUser(User);
	}

	@PutMapping("")
	public void updateUser(@RequestBody User User) {

	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") String id) {
		accountService.deleteUser(id);
	}

}
