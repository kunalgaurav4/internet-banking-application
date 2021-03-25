package com.cg.iba.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Nominee {
	@Id
	private int nomineeId;
	private String name;
	private String govtId;
	private String govtIdType;
	private String phoneNo;
	private Relation relation;

	@ManyToOne
	@JoinColumn(name="accountId",referencedColumnName = "accountId")
	private Account account;
//	private SavingsAccount savings_account;

	public String getGovtIdType() {
		return govtIdType;
	}

	

	public void setGovtIdType(String govtIdType) {
		this.govtIdType = govtIdType;
	}

	public Relation getRelation() {
		return relation;
	}

	public void setRelation(Relation relation) {
		this.relation = relation;
	}

	public int getNomineeId() {
		return nomineeId;
	}

	public void setNomineeId(int nomineeId) {
		this.nomineeId = nomineeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGovtId() {
		return govtId;
	}

	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

		
//	
//	public SavingsAccount getSavings_account() {
//		return savings_account;
//	}
//
//
//
//	public void setSavings_account(SavingsAccount savings_account) {
//		this.savings_account = savings_account;
//	}

	


	public Nominee() {

	}

	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public Nominee(int nomineeId, String name, String govtId, String govtIdType, String phoneNo, Relation relation) {
		super();
		this.nomineeId = nomineeId;
		this.name = name;
		this.govtId = govtId;
		this.govtIdType = govtIdType;
		this.phoneNo = phoneNo;
		this.relation = relation;
	}



	public Nominee(Account account) {
		super();
		this.account = account;
	}

//
//
//	public Nominee(SavingsAccount savings_account) {
//		super();
//		this.savings_account = savings_account;
//	}
	
	
	
	

}
