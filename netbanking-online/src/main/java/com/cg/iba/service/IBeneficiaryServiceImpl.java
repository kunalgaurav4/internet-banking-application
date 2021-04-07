package com.cg.iba.service;

/**
 * 
 * @author Rahul Khuraijam
 * @version 1.0
 *
 */
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Beneficiary;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.repository.IBeneficiaryRepository;

@Service
public class IBeneficiaryServiceImpl implements IBeneficiaryService {
	@Autowired
	IBeneficiaryRepository iRep;

	/**
	 * @param Beneficiary
	 * @return List<Beneficiary>
	 */
	@Override
	public List<Beneficiary> addBeneficiary(Beneficiary beneficiary) {
		iRep.saveAndFlush(beneficiary);
		return iRep.findAll();
	}

	/**
	 * @param Beneficiary
	 * @return List<Beneficiary>
	 */
	@Override
	public List<Beneficiary> updateBeneficiary(Beneficiary beneficiary) {
		iRep.saveAndFlush(beneficiary);
		return iRep.findAll();
	}

	/**
	 * @param beneficiaryId
	 * @return List<Beneficiary>
	 */
	@Override
	public List<Beneficiary> deleteBeneficiary(long beneficiaryId) {
		iRep.deleteById(beneficiaryId);
		return iRep.findAll();
	}

	/**
	 * @param beneficiaryId
	 * @return List<Beneficiary>
	 */
	@Override
	public Beneficiary findBeneficiaryById(long beneficiaryId) {
		return iRep.findById(beneficiaryId).get();
	}

	/**
	 * @param accountid
	 * @return Set<Beneficiary>
	 */
	@Override
	public Set<Beneficiary> listAllBeneficiaries(long accountid) {
		return iRep.listAllBeneficiaries(accountid);
	}

}
