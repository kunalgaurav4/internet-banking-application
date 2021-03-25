package com.cg.iba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.SavingsAccount;
import com.cg.iba.entities.TermAccount;
import com.cg.iba.repository.IAccountRepository;

@Service
public class IAccountServiceImpl implements IAccountService {

	@Autowired
	IAccountRepository iAcc;

	@Override
	public List<SavingsAccount> addSavingsAccount(SavingsAccount saving) {
		iAcc.saveAndFlush(saving);
		return null;
	}

	@Override
	public List<TermAccount> addTermAccount(TermAccount term) {
		iAcc.saveAndFlush(term);
		return null;
	}

	@Override
	public Account getAccountByID(int accountId) {
		Optional<Account> op = iAcc.findById(accountId);
		if (op.isPresent())
			return op.get();
		else
			return null;
	}

	@Override
	public List<SavingsAccount> updateSavingsAccount(SavingsAccount updS) {
		// TODO Auto-generated method stub
		iAcc.saveAndFlush(updS);
		return null;
	}

	@Override
	public List<TermAccount> updateTermAccount(TermAccount updT) {
		// TODO Auto-generated method stub
		iAcc.saveAndFlush(updT);
		return null;
	}

	@Override
	public SavingsAccount deleteSavingId(int accountId) {
		iAcc.deleteById(accountId);
		return null;
	}

	@Override
	public TermAccount deleteTermId(int accountId) {
		iAcc.deleteById(accountId);
		return null;
	}

	@Override
	public List<Account> addAccount(Account saving) {
		iAcc.saveAndFlush(saving);
		return null;
	}
	
	

}
