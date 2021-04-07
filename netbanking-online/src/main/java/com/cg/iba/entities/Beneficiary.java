package com.cg.iba.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Beneficiary {
	@Id
	private long beneficiaryId;
	private String beneficiaryName;
	private int beneficiaryAccNo;
	private String IFSC;
	private AccountType accountType;
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "accountId", referencedColumnName = "accountId")
	private Account account;
	public Beneficiary() {

	}

	public Beneficiary(long beneficiaryId, String beneficiaryName, int beneficiaryAccNo, String iFSC,AccountType accountType) {
		super();
		this.beneficiaryId = beneficiaryId;
		this.beneficiaryName = beneficiaryName;
		this.beneficiaryAccNo = beneficiaryAccNo;
		IFSC = iFSC;
		this.accountType=accountType;
	}

	public long getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public int getBeneficiaryAccNo() {
		return beneficiaryAccNo;
	}

	public void setBeneficiaryAccNo(int beneficiaryAccNo) {
		this.beneficiaryAccNo = beneficiaryAccNo;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType=accountType;
	}
	public Beneficiary(Account account) {
		super();
		this.account = account;
	}


	public Beneficiary get() {
		// TODO Auto-generated method stub
		return null;
	}

}
