package com.cg.iba.service;

/**
 * 
 * @author Aman Paul
 * @version 1.0
 */

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.cg.iba.entities.Nominee;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;

public interface INomineeService {
	public List<Nominee> addNominee(Nominee nominee);

	public List<Nominee> updateNominee(Nominee nominee);

	public List<Nominee> deleteNominee(int nomineeId);

	public Nominee findNomineeById(int nomineeId);

	public Set<Nominee> listAllNominees(int accountId);
}
