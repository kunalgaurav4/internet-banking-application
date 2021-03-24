package com.cg.iba.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Customer;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.repository.ICustomerRepository;

@Service
public class ICustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerRepository iRep;

	@Override
	public List<Customer> addCustomer(Customer customer) {
		iRep.saveAndFlush(customer);
		return iRep.findAll();
	}

	@Override
	public List<Customer> updateCustomer(Customer customer) {

		iRep.saveAndFlush(customer);
		return iRep.findAll();
	}

	@Override
	public List<Customer> deleteCustomer(int customerId) {
		iRep.deleteById(customerId);
		return iRep.findAll();
	}

	@Override
	public Customer findCustomerById(int customerId) {
		return iRep.findById(customerId).get();
	}

	 /*@Override
	 public Set<Customer> listAllCustomers(double minBalance) {
	    return iRep.listAllCustomers(minBalance).get();
	 }

	@Override
	public Customer viewCustomerDetails(int accountid) {
		
		return iRep.viewCustomerDetails(accountid).get();
	}*/

}