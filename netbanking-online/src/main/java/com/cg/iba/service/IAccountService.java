package com.cg.iba.service;

import java.util.List;
import java.util.Set;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.Customer;
import com.cg.iba.entities.Nominee;
import com.cg.iba.entities.SavingsAccount;
import com.cg.iba.entities.TermAccount;
import com.cg.iba.entities.Transaction;
import com.cg.iba.entities.TransactionStatus;

/**
 * @author Kunal Gaurav
 * @version 1.0
 */
public interface IAccountService {
	public List<Account> addAccount(Account saving);

	public List<SavingsAccount> addSavingsAccount(SavingsAccount saving);

	public List<TermAccount> addTermAccount(TermAccount term);

	public boolean deleteSavingId(long accountId);

	public boolean deleteTermId(long accountId);

	public Account getAccountByID(long accountId);

	public List<SavingsAccount> updateSavingsAccount(SavingsAccount updS);

	public List<TermAccount> updateTermAccount(TermAccount updT);

	public Transaction withdraw(double amount, long accountId, long CustomerId, String password);

	public List<Account> viewAccounts(long customerId);

	public List<Account> viewSavingAcc(long customerId);

	public List<Account> viewTermAcc(long customerId);

	public Transaction deposit(double amount, long accountId);

	public Transaction transferMoney(long senderAccountId, long reciverAccountId, double amount, long customerId,
			String password);



}
