package com.cg.iba.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Transaction;

import com.cg.iba.repository.ITransactionRepository;

@Service
public class ITransactionServiceImpl implements ITransactionService {
	@Autowired
	ITransactionRepository iRep;

	@Override
	public Transaction createTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		iRep.saveAndFlush(transaction);
		return null;
	}

	@Override
	public Transaction findTransactionById(int transactionId) {
		// TODO Auto-generated method stub
		Optional<Transaction> Tr = iRep.findById(transactionId);
		if (Tr.isPresent())
			return Tr.get();
		else

			return null;
	}

	@Override
	public Transaction viewTransaction(int transactionId) {
		// TODO Auto-generated method stub
		Optional<Transaction> Tr = iRep.findById(transactionId);
		if (Tr.isPresent())
			return Tr.get();
		else

			return null;
	}

//	@Override
//	public Set<Transaction> listAllTransactions(int accountId, LocalDate from, LocalDate to) {
//		// TODO Auto-generated method stub
//		iRep.saveAndFlush(null)
//		return null;
//	}

//	@Override
//	public Set<Transaction> getAllMyAccTransactions(int account_id) {
//		// TODO Auto-generated method stub
//		iRep.findAll(account_id);
//		return null;
//	}

}
