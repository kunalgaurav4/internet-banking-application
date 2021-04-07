package com.cg.iba.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Dileep
 * @version 1.0
 *
 */
@Entity
public class Customer extends User {

	private String customerName;
	private String phoneNo;
	private String emailId;
	private int age;
	private Gender gender;

	@OneToMany(mappedBy = "customer")
	@JsonIgnore
	private Set<Account> account;

	public Customer() {

	}

	public Customer(String customerName, String phoneNo, String emailId, int age, Gender gender, Set<Account> account) {
		super();
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
		this.account = account;
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

	public Set<Account> getAccount() {
		return account;
	}

	public void setAccount(Set<Account> account) {
		this.account = account;
	}

}
