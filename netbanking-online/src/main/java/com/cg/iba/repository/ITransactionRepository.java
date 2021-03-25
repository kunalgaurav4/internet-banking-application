package com.cg.iba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.iba.entities.Transaction;

@Repository
public interface ITransactionRepository extends JpaRepository<Transaction, Integer> {

//    List findByAccountNumberEquals(String accountNumber);

}
