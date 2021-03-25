package com.cg.iba.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Nominee;
import com.cg.iba.repository.INomineeRepository;

@Service
public class INomineeServiceImpl implements INomineeService {
	@Autowired
	INomineeRepository iRep;

	@Override
	public List<Nominee> addNominee(Nominee nominee) {
		iRep.saveAndFlush(nominee);
		return iRep.findAll();
	}

	  @Override 
	  public List<Nominee> updateNominee(Nominee nominee) 
	  {
		  iRep.saveAndFlush(nominee); 
		  return iRep.findAll(); 
	  }
	 
	  @Override
	  public List<Nominee> deleteNominee(int nomineeId) 
	  {
		   iRep.deleteById(nomineeId); 
		   return iRep.findAll();
	}
	  
	  @Override 
	  public Nominee findNomineeById(int nomineeId) 
	  {  
		  return iRep.findById(nomineeId).get();
	}
	 
	@Override
	public List<Nominee> listAllNominees(int accountId) {
		 iRep.findById(accountId);
		 return iRep.findAll();
	}

}