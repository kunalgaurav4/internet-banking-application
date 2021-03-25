package com.cg.iba.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Beneficiary;
import com.cg.iba.repository.IBeneficiaryRepository;
@Service
public class IBeneficiaryServiceImpl implements IBeneficiaryService {
	@Autowired
	IBeneficiaryRepository iRep;

	@Override
	public List<Beneficiary> addBeneficiary(Beneficiary beneficiary) {
		iRep.saveAndFlush(beneficiary);
		return iRep.findAll();
	}

	  @Override 
	  public List<Beneficiary> updateBeneficiary(Beneficiary beneficiary) 
	  {
		   iRep.saveAndFlush(beneficiary);
		   return iRep.findAll();
		  
	  }
	 
	  @Override
	  public Boolean  deleteBeneficiary(long beneficiaryId) 
	  {
		   iRep.deleteById(beneficiaryId);
		    return true;
		   
	}
	  
	  @Override 
	  public Beneficiary findBeneficiaryById(long beneficiaryId) 
	  {  
		  return iRep.findById(beneficiaryId).get();
	}
	 
	//@Override
	//public Set<Nominee> listAllNominees(int accountid) {
		//return iRep.listAllNominees(accountid);
	//}

}
