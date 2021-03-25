package com.cg.iba.service;

import java.util.List;
import java.util.Optional;

import com.cg.iba.bean.User;
import com.cg.iba.exception.InvalidDetailsException;



public interface IUserService {
	public List<User> addNewUser(User user) throws InvalidDetailsException;
	public List<User> updateUserInfo(User user) throws InvalidDetailsException;
	public Optional<User> deleteUserInfo(long userId);
	//public String signIn(Long userId, String password) throws InvalidDetailsException;
	public User signIn(User user) throws InvalidDetailsException;

}
