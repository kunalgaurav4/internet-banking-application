package com.cg.iba.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Customer;


@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

		
	
}
