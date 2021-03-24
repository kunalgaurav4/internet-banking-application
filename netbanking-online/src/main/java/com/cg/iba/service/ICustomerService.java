package com.cg.iba.service;


import java.util.List;
import java.util.Optional;
import java.util.Set;
import com.cg.iba.exception.DetailsNotFoundException;
//import com.cg.iba.exception.EmptyListException;
//import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;


import com.cg.iba.entities.Customer;

public interface ICustomerService {
	public List<Customer> addCustomer(Customer customer);
	public List<Customer> updateCustomer(Customer customer);
	public List<Customer> deleteCustomer(int customerId);
	public Customer findCustomerById(int customerId);
	//public Set<Customer> listAllCustomers(double minBalance);
	//public Customer viewCustomerDetails(int accountid);
	
}
