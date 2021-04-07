package com.cg.iba.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Nominee;

/**
 * 
 * @author Aman Paul
 * @version 1.0
 */
@Repository
public interface INomineeRepository extends JpaRepository<Nominee, Integer> {

	@Query("select n from Nominee n where n.account.accountId=:id")
	public Set<Nominee> findByAccount(@Param("id") long id);
}
