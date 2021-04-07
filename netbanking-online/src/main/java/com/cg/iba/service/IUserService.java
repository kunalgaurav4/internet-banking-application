package com.cg.iba.service;

import java.util.List;
import java.util.Optional;

import com.cg.iba.entities.User;
import com.cg.iba.exception.InvalidDetailsException;

/**
 * 
 * @author Eisha
 * @version 1.0
 *
 */
public interface IUserService {
	public List<User> addNewUser(User user);

	public List<User> updateUserInfo(User user);

	public Optional<User> deleteUserInfo(long customerId);

}
