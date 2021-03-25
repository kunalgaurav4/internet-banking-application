package com.cg.iba.service;


import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.cg.iba.entities.Beneficiary;

public interface IBeneficiaryService {
	public List<Beneficiary> addBeneficiary(Beneficiary beneficiary);
	public List<Beneficiary> updateBeneficiary(Beneficiary beneficiary);
	public Boolean  deleteBeneficiary(long beneficiaryId);
	public Beneficiary findBeneficiaryById(long beneficiaryId);
	//public Set<Nominee> listAllNominees(int accountid);
}
