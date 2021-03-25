package com.cg.iba.entities;

import javax.persistence.Entity;

@Entity
public class SavingsAccount extends Account{

    private double minBalance;
    private double fine;
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	public SavingsAccount(double minBalance, double fine) {
		super();
		this.minBalance = minBalance;
		this.fine = fine;
	} 

	public SavingsAccount() {
		
	}
}
