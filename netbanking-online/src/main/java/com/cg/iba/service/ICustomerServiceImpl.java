package com.cg.iba.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Customer;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.repository.ICustomerRepository;

/**
 * 
 * @author Dileep
 * @version 1.0
 *
 */
@Service
public class ICustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerRepository iRep;

	/**
	 * @param Customer
	 * @return List<Customer>
	 */
	@Override
	public List<Customer> addCustomer(Customer customer) {
		iRep.saveAndFlush(customer);
		return iRep.findAll();
	}

	/**
	 * @param Customer
	 * @return List<Customer>
	 */
	@Override
	public List<Customer> updateCustomer(Customer customer) {

		iRep.saveAndFlush(customer);
		return iRep.findAll();
	}

	/**
	 * @param customerId
	 * @return List<Customer>
	 */
	@Override
	public List<Customer> deleteCustomer(long customerId) {
		iRep.deleteById(customerId);
		return iRep.findAll();
	}

	/**
	 * @param customerId
	 * @return Customer
	 */
	@Override
	public Customer findCustomerById(long customerId) {
		return iRep.findById(customerId).get();
	}

}
