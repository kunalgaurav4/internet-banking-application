package com.cg.iba.service;

import java.util.Set;

import com.cg.iba.entities.Customer;
import com.cg.iba.entities.Transaction;

import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;

public interface ICustomerService {

	public Customer  addCustomer(Customer customer) throws InvalidDetailsException;
	public Customer updateCustomer(Customer customer)throws InvalidDetailsException ;
	public boolean deleteCustomer(long customer_id) throws DetailsNotFoundException;
	
	public Set<Customer> listAllCustomers(double minBalance) throws EmptyListException;
	public Customer viewCustomerDetails(long account_id) throws InvalidAccountException,DetailsNotFoundException ;
	
	public  Customer findCustomerById(long customer_id) throws DetailsNotFoundException;
	
}
