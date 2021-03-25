package com.cg.iba.service;

import java.time.LocalDate;
import java.util.Set;

import com.cg.iba.entities.Transaction;

public interface ITransactionService {

	public Transaction createTransaction(Transaction transaction);
	public Transaction viewTransaction(int transactionId) ;
	public Transaction findTransactionById(int transactionId) ;
	//public  Set<Transaction> listAllTransactions(int accountId) ;
//	public  Set<Transaction> getAllMyAccTransactions(int account_id) ;

}
