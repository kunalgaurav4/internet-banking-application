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
    
}
