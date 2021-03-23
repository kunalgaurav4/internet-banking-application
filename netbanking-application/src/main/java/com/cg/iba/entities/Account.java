package com.cg.iba.entities;


import java.time.LocalDate;
import java.util.Set;

public class Account {
    private long accounId; 
    private double interestRate;
    private double balance;
    private LocalDate  dateOfOpening;
    private Set<Customer> customers;
    private Set<Nominee> nominees;
    private Set<Beneficiary> beneficiaries;
	public long getAccounId() {
		return accounId;
	}
	public void setAccounId(long accounId) {
		this.accounId = accounId;
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
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	public Set<Nominee> getNominees() {
		return nominees;
	}
	public void setNominees(Set<Nominee> nominees) {
		this.nominees = nominees;
	}
	public Set<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}
	public void setBeneficiaries(Set<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
    
    
    
    
 }
