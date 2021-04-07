package com.cg.iba.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.cg.iba.entities.Beneficiary;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;

/**
 * 
 * @author Rahul Khuraijam
 * @version 1.0
 *
 */
public interface IBeneficiaryService {
	public List<Beneficiary> addBeneficiary(Beneficiary beneficiary);

	public List<Beneficiary> updateBeneficiary(Beneficiary beneficiary);

	public List<Beneficiary> deleteBeneficiary(long beneficiaryId);

	public Beneficiary findBeneficiaryById(long beneficiaryId);

	public Set<Beneficiary> listAllBeneficiaries(long accountid);
}
