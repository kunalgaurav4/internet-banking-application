package com.cg.iba.service;

/**
 * 
 * @author Aman Paul
 * @version 1.0
 */

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.Nominee;
import com.cg.iba.repository.INomineeRepository;

@Service
public class INomineeServiceImpl implements INomineeService {
	@Autowired
	INomineeRepository iRep;

	/**
	 * @param Nominee
	 * @return List<Nominee>
	 */
	@Override
	public List<Nominee> addNominee(Nominee nominee) {
		iRep.saveAndFlush(nominee);
		return iRep.findAll();
	}

	/**
	 * @param Nominee
	 * @return List<Nominee>
	 */
	@Override
	public List<Nominee> updateNominee(Nominee nominee) {
		iRep.saveAndFlush(nominee);
		return iRep.findAll();
	}

	/**
	 * @param nomineeId
	 * @return List<Nominee>
	 */
	@Override
	public List<Nominee> deleteNominee(int nomineeId) {
		iRep.deleteById(nomineeId);
		return iRep.findAll();
	}

	/**
	 * @param nomineeId
	 * @return List<Nominee>
	 */
	@Override
	public Nominee findNomineeById(int nomineeId) {
		return iRep.findById(nomineeId).get();
	}

	/**
	 * @param accountId
	 * @return Set<Nominee>
	 */
	@Override
	public Set<Nominee> listAllNominees(int accountId) {
		return iRep.findByAccount(accountId);
	}

}