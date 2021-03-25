package com.cg.iba.repository;


import java.util.Set;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.Nominee;



@Repository
public interface INomineeRepository extends JpaRepository<Nominee, Integer>{
	
	//@Query("select e from Nominee e where e.accountId='accountId'")
	//public Set<Account> findByAccount(@Param("accountId")int accountId);
}
