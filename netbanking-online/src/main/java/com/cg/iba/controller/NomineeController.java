package com.cg.iba.controller;

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

import com.cg.iba.entities.Nominee;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.service.INomineeService;


@RestController
@RequestMapping("/nominee")
public class NomineeController {
	@Autowired
	INomineeService ins;

	@PostMapping("/add")
	public List<Nominee> addNominee(@RequestBody Nominee nominee) throws InvalidDetailsException {
		List<Nominee> n = null;
		try {
			n = ins.addNominee(nominee);
		} catch (Exception e) {
			throw new InvalidDetailsException("The details given are not valid!");
		}
		return n;
	}

	@PutMapping("update")
	public List<Nominee> updateNominee(@RequestBody Nominee nominee) throws InvalidDetailsException {
		List<Nominee> n = null;
		try {
			n = ins.updateNominee(nominee);
		} catch (Exception e) {
			throw new InvalidDetailsException("The details given are not valid!");
		}
		return n;
	}

	@DeleteMapping("delete/{nomineeId}")
	public List<Nominee> deleteNominee(@PathVariable int nomineeId) throws DetailsNotFoundException {
		List<Nominee> n = null;
		try {
			n = ins.deleteNominee(nomineeId);
		} catch (Exception e) {
			throw new DetailsNotFoundException("The given ID is deleted!");
		}
		return n;
	}

	@GetMapping("find/{nomineeId}")
	public Nominee findNomineeById(@PathVariable int nomineeId) throws DetailsNotFoundException {
		Nominee n = null;
		try {
			n = ins.findNomineeById(nomineeId);
		} catch (Exception e) {
			throw new DetailsNotFoundException("The given ID is not found!");
		}
		return n;
	}

	@GetMapping("all/{accountId}")
	public List<Nominee> listAllNominees(@PathVariable int accountId) {
		return ins.listAllNominees(accountId);
	}
}
