package com.cg.iba.entities;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class TermAccount extends Account {

	private double amount;
	private int months = 12;
	private double penaltyAmount = 100;

//	TermAccount t = new TermAccount();
//
//	public double balan() {
//		amount = t.getBalance();
//
//		if (t.getWithdrawMonth() < 50) {
//			return t.getBalance() - penaltyAmount;
//		} else {
//			return t.getBalance();
//		}
//
//	}

	public TermAccount() {

	}

	public TermAccount(double amount, int months, double penaltyAmount) {
		super();
		this.amount = amount;
		this.months = months;
		this.penaltyAmount = penaltyAmount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

}
