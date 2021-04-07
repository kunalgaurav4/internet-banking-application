package com.cg.iba.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class SavingsAccount extends Account {
	
	private double minBalance = 3000;
	private double fine = 100;

//	public SavingsAccount(double minBalance, double fine) {
//		super();
//		this.minBalance = minBalance;
//		this.fine = fine;
//	}

	public SavingsAccount() {

	}
//	SavingsAccount acc = new SavingsAccount();
	
//	public double sbal() {
//		
//		if (minBalance < acc.getBalance()) {
//			return acc.getBalance()-fine;
//		}
//		else {
//			return acc.getBalance();
//		}
//	}
//	
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

}
