package com.cg.iba.repository;

import java.util.Set;

import com.cg.iba.entities.Nominee;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;

public interface INomineeRepository {

	public Nominee addNominee(Nominee nominee) throws InvalidDetailsException;
	public Nominee updateNominee(Nominee nominee) throws InvalidDetailsException;
	public boolean deleteNominee(long nomineeId) throws DetailsNotFoundException ;
	public Nominee findNomineeById(long nomineeId)throws DetailsNotFoundException ;
	public Set<Nominee> listAllNominees(long accountid) throws InvalidAccountException, EmptyListException ;
}
