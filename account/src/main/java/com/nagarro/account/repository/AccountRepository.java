package com.nagarro.account.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nagarro.account.entity.User;
import com.nagarro.account.userDb.UserDb;

@Component
public class AccountRepository {
	
	@Autowired
	UserDb userDb;

	public List<User> getAllUsers() {
		return userDb.getAllUsers();
	}

	public User getUserById(String id) {

		for (User user : userDb.getAllUsers()) {
			if (user.getId().equals(id))
				return user;
		}
		return null;
	}

	public User getUserByUserName(String userName) {

		for (User user : userDb.getAllUsers()) {
			if (user.getUserName().equals(userName))
				return user;
		}
		return null;
	}
	public User findByEmail(String email) {
		for (User user : userDb.getAllUsers()) {
			if (user.getEmail().equals(email))
				return user;
		}
		return null;
	}

	public void addUser(User user) {

		userDb.addUser(user);
	}

	public void deleteUser(String id) {
		userDb.getAllUsers().removeIf(user -> user.getId().equals(id));
	}

	public void updateUser(User updateUser) {
		userDb.getAllUsers().removeIf(user -> user.getId().equals(updateUser.getId()));
		userDb.getAllUsers().add(updateUser);
	}
	
//	public User loginUser(LoginDto login) {
//		return userData.getAllUsers().stream().filter(user -> user.getUserName().equals(login.getUsername())
//				&& user.getPassword().equals(login.getPassword())).findFirst().get();
//
//	}
}
