package com.cg.iba.service;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.cg.iba.entities.Admin;
import com.cg.iba.repository.IAdminRepository;
/**
 * 
 * @author Gayathri
 * @version 1.0
 *
 */

@Service
public class IAdminServiceImpl implements IAdminService {
	@Autowired
	IAdminRepository iRep;

	@Override
	public List<Admin> addAdmin(Admin admin) {
		iRep.saveAndFlush(admin);
		return iRep.findAll();
	}

	@Override
	public List<Admin> updateAdmin(Admin admin) {
		iRep.saveAndFlush(admin);
		return iRep.findAll();
	}

	@Override
	public List<Admin> deleteAdmin(long adminId) {
		iRep.deleteById(adminId);
		return iRep.findAll();
	}

	@Override
	public Admin findAdminById(long adminId) {
		return iRep.findById(adminId).get();
	}

	@Override
	public List<Admin> listAllAdmin() 
	{
	
		return iRep.findAll();
		
	}
}

