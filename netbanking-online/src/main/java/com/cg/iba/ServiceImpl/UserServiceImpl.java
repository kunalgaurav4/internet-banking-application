package com.cg.iba.service;

import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.bean.User;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.repository.IUserRepository;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRep;

	@Override
	public List<User> addNewUser(User user){
		// TODO Auto-generated method stub
		userRep.saveAndFlush(user);
		return userRep.findAll();
	}

	@Override
	public List<User> updateUserInfo(User user) {
		// TODO Auto-generated method stub
		userRep.saveAndFlush(user);
		return userRep.findAll();
	}

	@Override
	public Optional<User> deleteUserInfo(long userId) {
		// TODO Auto-generated method stub
		Optional<User> user =userRep.findById(userId);
		if(user!= null)
			userRep.deleteById(userId);
		return user;
	}

	@Override
	public User signIn(User user) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		Optional<User> user1=userRep.findById(user.getUserId());
		if(user1.isPresent()) {
			return user;
		}
		else {
			throw new InvalidDetailsException("Invalid userId or password");
		}
	}

//	@Override
//	public String signIn(Long userId, String password) {
//		// TODO Auto-generated method stub
//		String password1=userRep.getUserId(userId).getPassword();
//		if(password1.equals(password)) {
//			return "Login-Success";
//		}
//		else {
//			return "Invalid userid or password";
//		}
//		
//	}

}
