package com.cg.iba.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Transaction;

/**
 * 
 * @author Harinath Reddy
 * @version 1.0
 *
 */
@Repository
public interface ITransactionRepository extends JpaRepository<Transaction, Long> {

	@Query("select t from Transaction t where t.account.accountId=:id")
	public List<Transaction> getAllMyAccTransactions(@Param("id") long id);

}
