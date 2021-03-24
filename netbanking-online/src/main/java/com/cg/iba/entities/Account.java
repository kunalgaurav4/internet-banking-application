package com.cg.iba.entities;

//import java.time.Date;
import java.util.Date;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Account {

//	@GeneratedValue(generator = "sequence-generator")
//	@GenericGenerator(
//	name = "sequence-generator",
//	strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//			
//    parameters = {
//        @Parameter(name = "table_name", value = "REVISION_GENERATOR"),
//        @Parameter(name = "initial_value", value = "200"),
//        @Parameter(name = "increment_size", value = "1"),
//        @Parameter(name = "prefer_entity_table_as_segment_value", value = "true")
//	}
//	)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	private double interestRate;
	private double balance;
	private AccountType accountType;
	
//	@Temporal(TemporalType.DATE)
//	private Date dateOfOpening;
	
//	private Set<Customer> customers;
//	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
//	private Set<Nominee> nominees;
//	private Set<Beneficiary> beneficiaries;
//	private Set<Transaction> transaction;

	public Account() {

	}

	public Account(int accountId, double interestRate, double balance, AccountType accountType) {
		super();
		this.accountId = accountId;
		this.interestRate = interestRate;
		this.balance = balance;
//		this.dateOfOpening = dateOfOpening;
		this.accountType = accountType;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}



	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}


}
