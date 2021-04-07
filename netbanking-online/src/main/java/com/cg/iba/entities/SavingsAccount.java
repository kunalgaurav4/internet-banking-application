package com.cg.iba.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 * 
 * @author Kunal Gaurav
 * @version 1.0
 */
@Entity
public class SavingsAccount extends Account {

	private double minBalance = 3000;
	private double fine = 100;

	public SavingsAccount() {

	}

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
