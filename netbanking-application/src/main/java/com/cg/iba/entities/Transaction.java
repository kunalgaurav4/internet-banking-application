package com.cg.iba.entities;


import java.time.LocalDateTime;
import java.util.Set;

public class Transaction {

    private long transactionId;
    private double amount;
    private TransactionType transactionType; 
    private LocalDateTime dateTime; 
    private Account bankAccount; 
    private TransactionStatus transactionStatus;
    private String transactionRemarks;
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
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
	public Account getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(Account bankAccount) {
		this.bankAccount = bankAccount;
	}
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
