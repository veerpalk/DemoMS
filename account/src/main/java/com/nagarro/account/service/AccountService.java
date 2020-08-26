package com.nagarro.account.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nagarro.account.entity.User;
import com.nagarro.account.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;

//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;

	public List<User> getAllUsers() {
		return accountRepository.getAllUsers();
	}

	public User getUser(String id) {
		return accountRepository.getUserById(id);
	}

	public ResponseEntity<String> addUser(User user) {
		User userWithDuplicateUsername = accountRepository.getUserByUserName(user.getUserName());
		if (userWithDuplicateUsername != null && user.getId() != userWithDuplicateUsername.getId()) {
			throw new RuntimeException("Duplicate username.");
		}

		User userWithDuplicateEmail = accountRepository.findByEmail(user.getEmail());
		if (userWithDuplicateEmail != null && user.getId() != userWithDuplicateEmail.getId()) {
			throw new RuntimeException("Duplicate email.");
		}

		user.setPassword(user.getPassword());
		user.setId(UUID.randomUUID().toString());
		accountRepository.addUser(user);
		return new ResponseEntity<String>("User added successfully", HttpStatus.OK);
	}

	public ResponseEntity<String> deleteUser(String id) {
		accountRepository.deleteUser(id);
		return new ResponseEntity<String>("User deleted successfully", HttpStatus.OK);
	}

	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = accountRepository.getUserByUserName(userName);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}

		return null;

	}

}
