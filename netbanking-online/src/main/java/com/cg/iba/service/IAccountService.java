package com.cg.iba.service;

import java.util.List;
import java.util.Set;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.SavingsAccount;
import com.cg.iba.entities.TermAccount;



public interface IAccountService {
	
public List<Account> addAccount(Account saving);
	
	public List<SavingsAccount> addSavingsAccount(SavingsAccount saving);

	public List<TermAccount> addTermAccount(TermAccount term);

	public SavingsAccount deleteSavingId(int accountId);
	
	public TermAccount deleteTermId(int accountId);

	public Account getAccountByID(int accountId);

	public List<SavingsAccount> updateSavingsAccount(SavingsAccount updS);

	public List<TermAccount> updateTermAccount(TermAccount updT);


}
