package com.cg.iba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iba.entities.User;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.service.IUserService;
import com.cg.iba.util.LoginService;

/**
 * 
 * @author Eisha
 * @version 1.0
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private LoginService ls;

	@Autowired
	private IUserService is;

	@GetMapping("/user/{customerId}/{password}")
	public String validateUser(@PathVariable("customerId") long customerId, @PathVariable("password") String password) {

		User user = new User();
		user.setCustomerId(customerId);
		user.setPassword(password);
		return ls.validateCredintals(user);
	}

	@PostMapping("/add")
	public List<User> addNewUser(@RequestBody User user) throws InvalidDetailsException {
		List<User> n = null;
		try {
			n = is.addNewUser(user);
		} catch (Exception e) {
			throw new InvalidDetailsException("Invalid Details!!!");

		}
		return n;
	}

	@PutMapping("/update")
	public List<User> updateUserInfo(@RequestBody User user) throws InvalidDetailsException {
		List<User> n = null;
		try {
			n = is.updateUserInfo(user);
		} catch (Exception e) {
			throw new InvalidDetailsException("Invalid Details!!!");

		}
		return n;
	}

	@DeleteMapping("/delete/{userId}")
	public Optional<User> deleteUserInfo(long userId) throws DetailsNotFoundException {
		Optional<User> n = null;
		try {
			n = is.deleteUserInfo(userId);
		} catch (Exception e) {
			throw new DetailsNotFoundException("The given ID could not be deleted!");
		}
		return n;
	}

}
