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

import com.cg.iba.bean.User;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.service.IUserService;


@RestController
@RequestMapping("/v1")
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping("/user")
	public List<User> addNewUser(@RequestBody User user) throws InvalidDetailsException {
		List<User> n=null;
		try {
			n=userService.addNewUser(user);
		}
		catch(Exception e){
			throw new InvalidDetailsException("Invalid Details!!!");
			
		}
		return userService.addNewUser(user);
	}
	@PostMapping("/update")
	public List<User> updateUserInfo(@RequestBody User user) throws InvalidDetailsException{
		List<User> n=null;
		try {
			n=userService.updateUserInfo(user);
		}
		catch(Exception e){
			throw new InvalidDetailsException("Invalid Details!!!");
			
		}
		return userService.updateUserInfo(user);
	}
	@DeleteMapping("/deleteuser/{userId}")
	public Optional<User> deleteUserInfo(long userId){
		return userService.deleteUserInfo(userId);
	}
	@GetMapping("/user")
	public User signIn(@RequestBody User user) throws InvalidDetailsException {
		return userService.signIn(user);
	}
}
