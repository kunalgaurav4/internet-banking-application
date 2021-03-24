package com.cg.iba.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {
	@Id
    private int customerId; 
    private String customerName;
    private String phoneNo;
    private String emailId;
    private int age;
    private Gender gender;  
    
    //private Set<Account> account;
    public Customer() {
    	
    }
	public Customer(int customerId, String customerName, String phoneNo, String emailId, int age, Gender gender) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
		//this.account = account;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	//public Set<Account> getAccount() {
		//return account;
	//}
	//public void setAccount(Set<Account> account) {
    //	this.account = account;
//	}
		
 }
