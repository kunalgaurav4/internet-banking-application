package com.cg.iba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.Transaction;

/**
 * @author Kunal Gaurav
 * @version 1.0
 */
@Repository
public interface IAccountRepository extends JpaRepository<Account, Long> {

	@Query("select a from Account a where account_type=0 AND  a.customer.customerId=:id")
	public List<Account> viewSavingAcc(@Param("id") long id);

	@Query("select a from Account a where account_type=1 AND  a.customer.customerId=:id")
	public List<Account> viewTermAcc(@Param("id") long id);

}
