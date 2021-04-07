
package com.cg.iba.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.Transaction;
import com.cg.iba.repository.IAccountRepository;
import com.cg.iba.repository.ITransactionRepository;

/**
 * 
 * @author Harinath Reddy
 * @version 1.0
 *
 */
@Service
public class ITransactionServiceImpl implements ITransactionService {
	@Autowired
	ITransactionRepository iRep;

	@Autowired
	IAccountRepository iAcc;

	/**
	 * @param Transaction
	 * @return Transaction
	 */
	@Override
	public Transaction createTransaction(Transaction transaction) {
		Account a = new Account();
		double balance = a.getBalance() + transaction.getAmount();
		a.setBalance(balance);
		iRep.saveAndFlush(transaction);

		return null;
	}

	/**
	 * @param transactionId
	 * @return Transaction
	 */
	@Override
	public Transaction findTransactionById(long transactionId) {
		Transaction Tr = iRep.findById(transactionId).get();
		if (Tr != null)
			return Tr;
		else

			return null;
	}

	/**
	 * @param transactionId
	 * @return Transaction
	 */
	@Override
	public Transaction viewTransaction(long transactionId) {
		// TODO Auto-generated method stub
		Transaction Tr = iRep.findById(transactionId).get();
		if (Tr != null)
			return Tr;
		else

			return null;
	}

	/**
	 * @param accountId
	 * @return List<Transaction>
	 */

	@Override
	public List<Transaction> getAllMyAccTransactions(long accountId) {

		return iRep.getAllMyAccTransactions(accountId);
	}

}
