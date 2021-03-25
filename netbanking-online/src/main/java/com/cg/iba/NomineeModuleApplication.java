package com.cg.iba;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.Nominee;
import com.cg.iba.entities.Relation;
import com.cg.iba.repository.IAccountRepository;
import com.cg.iba.repository.INomineeRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@ComponentScan("com.cg")
@SpringBootApplication
@EnableSwagger2
public class NomineeModuleApplication {
	//@Autowired
	//private IAccountRepository iar;
	//@Autowired
	//private INomineeRepository inr;
	public static void main(String[] args) {
		SpringApplication.run(NomineeModuleApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Account a=new Account();
		//a.setAccounId(10);
		a.setBalance(1599.9);
		a.setInterestRate(4.59);	
		Set<Nominee>s=new HashSet<Nominee>();
		Nominee n=new Nominee();
		n.setGovtId("Aman Paul");
		n.setGovtIdType("Aadhar");
		n.setName("Aman");
		n.setNomineeId(101);
		n.setPhoneNo("987635");
		n.setRelation(Relation.SON);
		
		Nominee n1=new Nominee();
		n1.setGovtId("Rahul Paul");
		n1.setGovtIdType("Aadhar");
		n1.setName("Rahul");
		n1.setNomineeId(102);
		n1.setPhoneNo("986325");
		n1.setRelation(Relation.FATHER);
		s.add(n);
		s.add(n1);
		iar.save(a);
		n.setAccount(a);
		n1.setAccount(a);
		a.setNominees(s);
		inr.saveAll(s);
		
		
		System.out.println("done===============");
	}*/

}
