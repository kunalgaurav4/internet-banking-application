package com.cg.iba.service;

import java.util.List;
import com.cg.iba.entities.Transaction;

/**
 * 
 * @author Harinath Reddy
 * @version 1.0
 *
 */
public interface ITransactionService {

	public Transaction createTransaction(Transaction transaction);

	public Transaction viewTransaction(long transactionId);

	public Transaction findTransactionById(long transactionId);

	public List<Transaction> getAllMyAccTransactions(long accountId);

}
