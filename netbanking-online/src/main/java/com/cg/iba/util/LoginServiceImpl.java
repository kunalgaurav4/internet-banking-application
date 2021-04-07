package com.cg.iba.util;
/**
 * 
 * @author Eisha
 * @version 1.0
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDao ld;

	@Override
	public String validateCredintals(Object obj) {
		// TODO Auto-generated method stub
		return ld.validateCredintals(obj);
	}

	
}
