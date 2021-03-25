package com.cg.iba.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Account;


@Repository
public interface IAccountRepository extends JpaRepository<Account, Integer>{

	
}
