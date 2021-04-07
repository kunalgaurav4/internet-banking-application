package com.cg.iba.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.InvalidDetailsException;

import com.cg.iba.entities.Customer;

/**
 * 
 * @author Dileep
 * @version 1.0
 *
 */
public interface ICustomerService {
	public List<Customer> addCustomer(Customer customer);

	public List<Customer> updateCustomer(Customer customer);

	public List<Customer> deleteCustomer(long customerId);

	public Customer findCustomerById(long customerId);

}
