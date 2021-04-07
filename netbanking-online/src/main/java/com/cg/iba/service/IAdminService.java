package com.cg.iba.service;
import java.util.List;

import com.cg.iba.entities.Admin;

/**
 * 
 * @author Gayathri
 * @version 1.0
 *
 */

public interface IAdminService 
{
	public List<Admin> addAdmin(Admin admin);
	public List<Admin>updateAdmin(Admin admin);
	public List<Admin>deleteAdmin(long adminId);
	public Admin findAdminById(long adminId);
	public List<Admin>listAllAdmin();


}
