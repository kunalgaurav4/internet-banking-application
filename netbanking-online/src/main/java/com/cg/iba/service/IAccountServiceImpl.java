package com.cg.iba.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.SavingsAccount;
import com.cg.iba.entities.TermAccount;
import com.cg.iba.entities.Transaction;
import com.cg.iba.entities.TransactionStatus;
import com.cg.iba.entities.TransactionType;
import com.cg.iba.repository.IAccountRepository;
import com.cg.iba.repository.ITransactionRepository;

/**
 * @author Kunal Gaurav
 * @version 1.0
 */
@Service
public class IAccountServiceImpl implements IAccountService {

	@Autowired
	IAccountRepository iAcc;

	@Autowired
	ITransactionService iTrans;

	/**
	 * @param SavingsAccount
	 * @return null
	 */
	@Override
	public List<SavingsAccount> addSavingsAccount(SavingsAccount saving) {
		iAcc.saveAndFlush(saving);
		return null;
	}

	/**
	 * @param TermAccount
	 * @return null
	 */

	@Override
	public List<TermAccount> addTermAccount(TermAccount term) {
		iAcc.saveAndFlush(term);
		return null;
	}

	/**
	 * @param accountId
	 * @return Account
	 */

	@Override
	public Account getAccountByID(long accountId) {
		Optional<Account> op = iAcc.findById(accountId);
		if (op.isPresent())
			return op.get();
		else
			return null;
	}

	/**
	 * @param SavingsAccount
	 * @return null
	 */
	@Override
	public List<SavingsAccount> updateSavingsAccount(SavingsAccount updS) {
		// TODO Auto-generated method stub
		iAcc.saveAndFlush(updS);
		return null;
	}

	/**
	 * @param TermAccount
	 * @return null
	 */
	@Override
	public List<TermAccount> updateTermAccount(TermAccount updT) {
		// TODO Auto-generated method stub
		iAcc.saveAndFlush(updT);
		return null;
	}

	/**
	 * @param accountId
	 * @return boolean
	 */
	@Override
	public boolean deleteSavingId(long accountId) {
		if (accountId != 0) {
			iAcc.deleteById(accountId);
			return true;
		}
		return false;
	}

	/**
	 * @param accountId
	 * @return boolean
	 */
	@Override
	public boolean deleteTermId(long accountId) {
		if (accountId != 0) {
			iAcc.deleteById(accountId);
			return true;
		}
		return false;
	}

	/**
	 * @param Account
	 * @return null
	 */
	@Override
	public List<Account> addAccount(Account saving) {
		iAcc.saveAndFlush(saving);
		return null;
	}

	/**
	 * @param customerId
	 * @return List<Account>
	 */
	@Override
	public List<Account> viewAccounts(long customerId) {
		// TODO Auto-generated method stub
		return iAcc.findAll();
	}

	/**
	 * @param customerId
	 * @return List<Account>
	 */
	@Override
	public List<Account> viewSavingAcc(long customerId) {
		return iAcc.viewSavingAcc(customerId);
	}

	/**
	 * @param customerId
	 * @return List<Account>
	 */
	@Override
	public List<Account> viewTermAcc(long customerId) {
		// TODO Auto-generated method stub
		return iAcc.viewTermAcc(customerId);
	}

	/**
	 * @param amount,accountId
	 * @return Transaction
	 */
	@Override
	public Transaction deposit(double amount, long accountId) {
		Account a = getAccountByID(accountId);
		double balance = a.getBalance() + amount;
		a.setBalance(balance);
		iAcc.save(a);
		Transaction t = new Transaction();

		t.setAmount(amount);
		t.setDateTime(LocalDateTime.now());
		t.setTransactionType(TransactionType.CREDIT);
		t.setTransactionRemarks("Credit of Rs." + amount + " " + "successful");
		t.setTransactionStatus(TransactionStatus.SUCCESSFUL);
		t.setBankAccount(iAcc.findById(accountId).get());
		iTrans.createTransaction(t);
		return iTrans.findTransactionById(t.getTransactionId());

	}

	/**
	 * @param amount,accountId,customerId,password
	 * @return Transaction
	 */
	@Override
	public Transaction withdraw(double amount, long accountId, long customerId, String password) {
		Account a = getAccountByID(accountId);

		Transaction t = new Transaction();

		if (amount > a.getBalance()) {
			t.setAmount(a.getBalance());
			t.setDateTime(LocalDateTime.now());
			t.setTransactionType(TransactionType.DEBIT);
			t.setTransactionRemarks("You don't have sufficient balance.");
			t.setTransactionStatus(TransactionStatus.FAILED);
			iTrans.createTransaction(t);
			return null;

		} else {
			double balance = a.getBalance() - amount;
			a.setBalance(balance);
			iAcc.save(a);
			t.setAmount(amount);
			t.setDateTime(LocalDateTime.now());
			t.setTransactionType(TransactionType.DEBIT);
			t.setTransactionRemarks("Debit of Rs." + amount + " " + "is successful");
			t.setTransactionStatus(TransactionStatus.SUCCESSFUL);
			t.setBankAccount(iAcc.findById(accountId).get());
			iTrans.createTransaction(t);
			return iTrans.findTransactionById(t.getTransactionId());
		}
	}

	/**
	 * @param senderAccountId,reciverAccountId,amount,customerId,password
	 * @return Transaction
	 */
	@Override
	public Transaction transferMoney(long senderAccountId, long reciverAccountId, double amount, long customerId,
			String password) {
		// TODO Auto-generated method stub
//		Account t = new Account();

		Account a = getAccountByID(senderAccountId);

		Account b = getAccountByID(reciverAccountId);

		senderAccountId = a.getAccountId();
		reciverAccountId = b.getAccountId();
//		Account a = getAccountByID(t.getAccountId());
		Transaction sender = new Transaction();
		Transaction reciver = new Transaction();

		if (amount > a.getBalance()) {
			sender.setAmount(a.getBalance());
			sender.setDateTime(LocalDateTime.now());
			sender.setTransactionType(TransactionType.DEBIT);
			sender.setTransactionRemarks("You don't have sufficient balance.");
			sender.setTransactionStatus(TransactionStatus.FAILED);
			iTrans.createTransaction(sender);
			return null;

		} else {

//			sender
			double balance = a.getBalance() - amount;
			a.setBalance(balance);
			iAcc.save(a);
			sender.setAmount(amount);
			sender.setDateTime(LocalDateTime.now());
			sender.setTransactionType(TransactionType.DEBIT);
			sender.setTransactionRemarks("Debit of Rs." + amount + " " + "is successful");
			sender.setTransactionStatus(TransactionStatus.SUCCESSFUL);
			sender.setBankAccount(iAcc.findById(a.getAccountId()).get());
			iTrans.createTransaction(sender);

//			reciever
			double balance2 = b.getBalance() + amount;
			b.setBalance(balance2);
			iAcc.save(b);
			reciver.setAmount(amount);
			reciver.setDateTime(LocalDateTime.now());
			reciver.setTransactionType(TransactionType.CREDIT);
			reciver.setTransactionRemarks("Credit of Rs." + amount + " " + "is successful");
			reciver.setTransactionStatus(TransactionStatus.SUCCESSFUL);
			reciver.setBankAccount(iAcc.findById(b.getAccountId()).get());
			iTrans.createTransaction(reciver);

			return iTrans.findTransactionById(reciver.getTransactionId());

		}

	}

}
