package com.cg.iba.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iba.entities.Beneficiary;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.service.IBeneficiaryService;


@RestController
@RequestMapping("/beneficiary")
public class BeneficiaryController {
	@Autowired
	 IBeneficiaryService ibs;
	
	@PostMapping("add")
	public List<Beneficiary> addBeneficiary(@RequestBody Beneficiary beneficiary)throws InvalidDetailsException{
		List<Beneficiary> n=null;
		try {
			n=ibs.addBeneficiary(beneficiary);
		}
		catch(Exception e)
		{
			throw new InvalidDetailsException("Wrong Id");
		}
		
		return n;
		//return ibs.addBeneficiary(beneficiary);
	}
	
	  @PutMapping("update") 
	  public List<Beneficiary> updateBeneficiary(@RequestBody Beneficiary beneficiary)throws InvalidDetailsException
	  	{ 
		  List<Beneficiary >n=null;
		  try {
			  n=ibs.updateBeneficiary(beneficiary);
		  }
		  catch(Exception e)
		  {
			  throw new InvalidDetailsException("Invalid ID");
			  
		  }
		  return n;
		  //return ibs.updateBeneficiary(beneficiary); 
		}
	  
	  @DeleteMapping("delete/{beneficiaryId}") 
	  public Boolean deleteBeneficiary(@PathVariable long beneficiaryId) throws InvalidDetailsException
	  { 
		  Boolean n=null;
		  try {
			  n=ibs.deleteBeneficiary(beneficiaryId);
		  }
		  catch(Exception e)
		  {
			  throw new InvalidDetailsException("Invalid id ");
		  }
		  return n;
		  //return ibs.deleteBeneficiary(beneficiaryId); 
	}
	  
	  @GetMapping("find/{beneficiaryId}") 
	  public Beneficiary findBeneficiaryById(@PathVariable long beneficiaryId) throws InvalidDetailsException
	 {
		  Beneficiary n=null;
		  
		  try {
			  n=ibs.findBeneficiaryById(beneficiaryId);
		  }
		  catch(Exception e)
		  {
			  throw new InvalidDetailsException("Invalid Id");
		  }
		  return n;
		  //return ibs.findBeneficiaryById(beneficiaryId);
	  }
	  
	 
	//@GetMapping("all/{accountid}")
	//public Set<Nominee> listAllBeneficiaries(int accountid){
		//return ins.listAllBeneficiaries(accountid);
	//}
}