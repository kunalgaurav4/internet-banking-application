package com.cg.iba.bean;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
	@Id
	private Long userId;
	private String password;
	private Role role; 
	
	public User(Long userId, String password, Role role) {
		super();
		this.userId = userId;
		
		this.password = password;
		this.role = role;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public User() {
		super();
	}

	
	
}


