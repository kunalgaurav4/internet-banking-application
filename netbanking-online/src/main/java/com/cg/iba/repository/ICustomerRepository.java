package com.cg.iba.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.Customer;

/**
 * 
 * @author Dileep
 * @version 1.0
 *
 */

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

	@Query("select a from Customer a where accountId=:id")
	public List<Customer> viewCustomerDetais(@Param("id") long id);

}
