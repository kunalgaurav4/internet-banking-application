package com.cg.iba.entities;

import javax.persistence.Entity;
/**
 * 
 * @author Gayathri
 * @version 1.0
 *
 */
@Entity
public class Admin extends User {

	private String adminName;
	private String adminContact;
	private String adminEmailId;

	public Admin() {

	}

	public Admin(String adminName, String adminContact, String adminEmailId) {
		super();

		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmailId = adminEmailId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	public String getAdminEmailId() {
		return adminEmailId;
	}

	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}

}

