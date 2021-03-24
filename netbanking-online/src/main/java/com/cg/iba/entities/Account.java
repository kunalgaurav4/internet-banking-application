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
    
 }
