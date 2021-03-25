package com.cg.iba.entities;


import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "transaction")
public class Transaction {

	@Id
    @GeneratedValue

    private int transactionId;
    private double amount;
    private TransactionType transactionType; 
    private LocalDateTime dateTime; 
//    private Account bankAccount; 
    private TransactionStatus transactionStatus;
    private String transactionRemarks;
    
    public Transaction () {
    	
    }
	public Transaction(int transactionId, double amount, TransactionType transactionType, LocalDateTime dateTime, TransactionStatus transactionStatus, String transactionRemarks) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionType = transactionType;
		this.dateTime = dateTime;
//		this.bankAccount = bankAccount;
		this.transactionStatus = transactionStatus;
		this.transactionRemarks = transactionRemarks;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

//	public Account getBankAccount() {
//		return bankAccount;
//	}
//	public void setBankAccount(Account bankAccount) {
//		this.bankAccount = bankAccount;
//	}
	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String getTransactionRemarks() {
		return transactionRemarks;
	}
	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}
    
    
}
