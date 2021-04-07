package com.cg.iba.controller;

/**
 * 
 * @author Rahul Khuraijam
 * @version 1.0
 */

import java.util.List;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iba.entities.Beneficiary;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.service.IBeneficiaryService;

@RestController
@RequestMapping("/beneficiary")
public class BeneficiaryController {
	@Autowired
	IBeneficiaryService ibs;

	@PostMapping("/add")
	public List<Beneficiary> addBeneficiary(@RequestBody Beneficiary beneficiary) throws InvalidDetailsException {
		List<Beneficiary> n = null;
		try {
			n = ibs.addBeneficiary(beneficiary);
		} catch (Exception e) {
			throw new InvalidDetailsException("The details given are not valid!");
		}
		return n;
	}

	@PutMapping("update")
	public List<Beneficiary> updateBenficiary(@RequestBody Beneficiary beneficiary) throws InvalidDetailsException {
		List<Beneficiary> n = null;
		try {
			n = ibs.updateBeneficiary(beneficiary);
		} catch (Exception e) {
			throw new InvalidDetailsException("The details given are not valid!");
		}
		return n;
	}

	@DeleteMapping("delete/{beneficiaryId}")
	public List<Beneficiary> deleteBeneficiary(@PathVariable long beneficiaryId) throws DetailsNotFoundException {
		List<Beneficiary> n = null;
		try {
			n = ibs.deleteBeneficiary(beneficiaryId);
		} catch (Exception e) {
			throw new DetailsNotFoundException("The given ID is not found!");
		}
		return n;
	}

	@GetMapping("find/{beneficiaryId}")
	public Beneficiary findBeneficiaryById(@PathVariable long beneficiaryId) throws DetailsNotFoundException {
		Beneficiary n = null;
		try {
			n = ibs.findBeneficiaryById(beneficiaryId);
		} catch (Exception e) {
			throw new DetailsNotFoundException("The given ID is not found!");
		}
		return n;
	}

	@GetMapping("all/{accountId}")
	public Set<Beneficiary> listAllBeneficiaries(@PathVariable long accountId)
			throws InvalidAccountException, EmptyListException {
		Set<Beneficiary> n = null;
		try {
			n = ibs.listAllBeneficiaries(accountId);
			if(n.isEmpty()) {
				throw new EmptyListException("No Beneficiary exists");
			}
			
		}  catch(Exception e) {
			throw new EmptyListException("No account with this beneficiary exist !");
		}
		return n;
	}
}
