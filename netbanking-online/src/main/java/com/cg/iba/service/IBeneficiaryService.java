package com.cg.iba.service;

import java.util.Set;

import com.cg.iba.entities.Beneficiary;
import com.cg.iba.entities.Nominee;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;

public interface IBeneficiaryService {

	public Beneficiary addBeneficiary(Beneficiary beneficiary)throws InvalidDetailsException;
	public Beneficiary updateBeneficiary(Beneficiary beneficiary) throws InvalidDetailsException;
	public boolean deleteBeneficiary(long beneficiaryId) throws DetailsNotFoundException;
	public Beneficiary findBeneficiaryById(long beneficiaryId) throws DetailsNotFoundException;
	public Set<Beneficiary> listAllBeneficiaries(long accountid) throws InvalidAccountException,EmptyListException;
}
