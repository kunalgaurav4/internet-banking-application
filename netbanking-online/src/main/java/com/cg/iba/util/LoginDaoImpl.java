package com.cg.iba.util;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.cg.iba.entities.User;


import org.springframework.stereotype.Repository;
/**
 * 
 * @author Eisha
 * @version 1.0
 *
 */
@Transactional
@Repository
public class LoginDaoImpl implements LoginDao {
	@PersistenceContext
	EntityManager em;
		
	
	@Override
	public String validateCredintals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof User) {
			User u = (User) obj;
		
			TypedQuery<User> q =  em.createQuery("select u from User u where u.customerId=:uid and u.password=:pass",User.class);
			q.setParameter("uid", u.getCustomerId());
			q.setParameter("pass", u.getPassword());
			List<User> userList =  q.getResultList();
			if (userList.size() > 0) {
				return "login success";
			}
			else {
				return "Invalid";
		}
	}
		return null;

}
}

