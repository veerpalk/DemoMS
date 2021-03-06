package com.nagarro.account.userDb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.account.entity.User;
import com.nagarro.account.enums.Role;

@Component
public class UserDb {

	List<User> users = new ArrayList<User>() {
		{
			add(new User("1", Role.ADMIN, "veerpal", "admin",
					"$2a$04$StUyevRo.eaxfHBoqCgCZenlfZCsybSAdZMbe6PHRepY9MF.RFYyO", "veerpalkaur@nagarro.com",
					"9898467898", "#484 Sector 22A"));
			add(new User("2", Role.PRIME_CUSTOMER, "gunnu", "gunnu",
					"$2a$04$bscYAkkEyhAgABUBw4C5PusIImLe4CeyrFqDoA9YjGFCej7Vy5RZS", "gunnu@nagarro.com", "9818949269",
					"#484 Sector 22A"));
			add(new User("3", Role.PRIME_CUSTOMER, "davinder", "davy",
					"$2a$04$yjM7lBRISxPMkA/rry6oJ.XaXifpPn8mZllWxSor7in7siv/1kF56", "davy@nagarro.com", "9898489898",
					"#484 Sector 22A"));
			add(new User("4", Role.DELIVERY_TEAM, "malwinder", "mallu",
					"$2a$04$RZVJKUIssakafrO25k2a1.rNCaBs3.GmmmAoXFlcCIHegkTJMJDrK", "mallu@nagarro.com", "9898467898",
					"#784 Sector 23B"));
			add(new User("5", Role.CUSTOMER, "meenakshi", "meeni",
					"$2a$04$MDc1SQmQ8K8rnSrV7bhYret7uZu0n3LDRRldoPVnmXUUNjJ1ZeyZe", ",meeni@nagarro.com", "9845677898",
					"#44 Sector 23B"));
			add(new User("6", Role.CUSTOMER, "kirandeep", "kiran",
					"$2a$04$x9zUyx9BeNqxVJqLq7HvFe.ZMfqTlzLSdIsChNUEvn.SEDJYh9gSC", "kiran@nagarro.com", "9898467998",
					"#94 Sector 21A"));
			add(new User("7", Role.CUSTOMER, "sukhijeet", "sukhi",
					"$2a$04$xvshS/v8Nmww9GcFxTJLHummcYhzDmOucYfhZBBegwIOeBNSq0xX6", "sukhi@nagarro.com", "9844467898",
					"#44 Sector 21A"));

		}
	};

	public List<User> getAllUsers() {

		return this.users;

	}

	public void addUser(User usr) {
		this.users.add(usr);
	}

}
