package com.cg.iba.repository;



import com.cg.iba.entities.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author Gayathri
 * @version 1.0
 *
 */
@Repository

public interface IAdminRepository  extends JpaRepository<Admin,Long>
{

	

}

