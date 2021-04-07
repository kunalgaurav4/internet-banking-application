package com.cg.iba.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Beneficiary;

@Repository
public interface IBeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

	@Query("select n from Beneficiary n where n.account.accountId=:id")
	public Set<Beneficiary> listAllBeneficiaries(@Param("id") long id);
}
