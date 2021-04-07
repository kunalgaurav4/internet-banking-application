package com.cg.iba.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.User;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.repository.IUserRepository;

/**
 * 
 * @author Eisha
 * @version 1.0
 *
 */
@Service
@Transactional
public class IUserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRep;

	/**
	 * @param User
	 * @return List<User>
	 */
	@Override
	public List<User> addNewUser(User user) {
		// TODO Auto-generated method stub
		userRep.saveAndFlush(user);
		return userRep.findAll();
	}

	/**
	 * @param User
	 * @return List<User>
	 */
	@Override
	public List<User> updateUserInfo(User user) {
		// TODO Auto-generated method stub
		userRep.saveAndFlush(user);
		return userRep.findAll();
	}

	/**
	 * @param customerId
	 * @return Optional<User>
	 */
	@Override
	public Optional<User> deleteUserInfo(long customerId) {
		// TODO Auto-generated method stub
		Optional<User> user = userRep.findById(customerId);
		if (user != null)
			userRep.deleteById(customerId);
		return user;
	}

}
