package com.cg.iba.service;

import java.util.Set;

import com.cg.iba.entities.Admin;

import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidDetailsException;

public interface IAdminService {

	public Admin  addAdmin(Admin admin) throws InvalidDetailsException;
	public Admin findAdminById(long adminId)throws DetailsNotFoundException ;
	public Admin updateAdmin(Admin admin) throws InvalidDetailsException ;
	public boolean removeAdmin(long adminId)throws DetailsNotFoundException;
	public Set<Admin> listAllAdmins() throws EmptyListException;
}
