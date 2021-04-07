package com.cg.iba.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author Harinath Reddy
 * @version 1.0
 *
 */
@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long transactionId;
	private double amount;
	private TransactionType transactionType;
	private LocalDateTime dateTime;

	private TransactionStatus transactionStatus;
	private String transactionRemarks;

	@ManyToOne
	@JoinColumn(name = "account_Id")
	@JsonIgnore
	private Account account;

	public Transaction() {

	}

	public Transaction(long transactionId, double amount, TransactionType transactionType, LocalDateTime dateTime,
			TransactionStatus transactionStatus, String transactionRemarks, Account account) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionType = transactionType;
		this.dateTime = dateTime;
		this.account = account;
		this.transactionStatus = transactionStatus;
		this.transactionRemarks = transactionRemarks;
	}

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

	public Account getAccount() {
		return account;
	}

	public void setBankAccount(Account account) {
		this.account = account;
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
