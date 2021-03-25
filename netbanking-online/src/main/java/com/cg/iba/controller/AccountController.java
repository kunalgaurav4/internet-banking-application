package com.cg.iba.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.SavingsAccount;
import com.cg.iba.entities.TermAccount;
import com.cg.iba.service.IAccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	IAccountService accService;
	
	@PostMapping("/add")
	public List<Account> addAccount(@RequestBody Account saving) {
		return accService.addAccount(saving);

	}


	@PostMapping("/saving")
	public List<SavingsAccount> addSavingAccount(@RequestBody SavingsAccount saving) {
		return accService.addSavingsAccount(saving);

	}

	@PostMapping("/term")
	public List<TermAccount> addTermAccount(@RequestBody TermAccount term) {
		return accService.addTermAccount(term);

	}

	@DeleteMapping("close-saving/{accountId}")
	public SavingsAccount closeSavingAccount(@PathVariable int accountId) {
		return accService.deleteSavingId(accountId);
	}

	@DeleteMapping("close-term/{accountId}")
	public TermAccount closeTermAccount(@PathVariable int accountId) {
		return accService.deleteTermId(accountId);
	}

	@GetMapping("/{accountId}")
	public Account findAccount(@PathVariable int accountId) {

		return accService.getAccountByID(accountId);

	}

	@PutMapping("/update/saving")
	public List<SavingsAccount> updateSavingsAccount(@RequestBody SavingsAccount updS) {

		return accService.updateSavingsAccount(updS);
	}

	@PutMapping("/update/term")
	public List<TermAccount> updateTermAccount(@RequestBody TermAccount updT) {

		return accService.updateTermAccount(updT);
	}

}
