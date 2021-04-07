package com.cg.iba.entities;

//import java.time.Date;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Kunal Gaurav
 * @version 1.0
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {

		@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountId;
	private double interestRate;
	private double balance;
	private AccountType accountType;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfOpening;

	@ManyToOne
	
	private Customer customer;

	@OneToMany(mappedBy = "account")
	@JsonIgnore
	private Set<Nominee> nominees;

	@OneToMany(mappedBy = "account")
	@JsonIgnore
	private Set<Beneficiary> beneficiaries;
//
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
	private Set<Transaction> transaction;

	public Account() {

	}

	public Account(long accountId, double interestRate, double balance, AccountType accountType, Set<Nominee> nominees,
			Set<Beneficiary> beneficiaries, Customer customer, Set<Transaction> transaction, LocalDate dateOfOpening) {
		super();
		this.accountId = accountId;
		this.interestRate = interestRate;
		this.balance = balance;
		this.dateOfOpening = dateOfOpening;
		this.accountType = accountType;
		this.nominees = nominees;
		this.transaction = transaction;
		this.customer = customer;
//	
		this.beneficiaries = beneficiaries;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Set<Nominee> getNominees() {
		return nominees;
	}

	public void setNominees(Set<Nominee> nominees) {
		this.nominees = nominees;
	}

	public Set<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}

	public Set<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(Set<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}



}
