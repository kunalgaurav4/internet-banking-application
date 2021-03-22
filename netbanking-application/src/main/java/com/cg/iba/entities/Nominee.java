package com.cg.iba.entities;

 
public class Nominee {

    private long nomineeId;
    private String name;
    private String govtId; 
    private String govtIdType; 
    private String phoneNo;
    private Relation relation;
	public long getNomineeId() {
		return nomineeId;
	}
	public void setNomineeId(long nomineeId) {
		this.nomineeId = nomineeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGovtId() {
		return govtId;
	}
	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}
	public String getGovtIdType() {
		return govtIdType;
	}
	public void setGovtIdType(String govtIdType) {
		this.govtIdType = govtIdType;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Relation getRelation() {
		return relation;
	}
	public void setRelation(Relation relation) {
		this.relation = relation;
	}
	public Nominee() {
		
	}
	public Nominee(long nomineeId, String name, String govtId, String govtIdType, String phoneNo, Relation relation) {
		super();
		this.nomineeId = nomineeId;
		this.name = name;
		this.govtId = govtId;
		this.govtIdType = govtIdType;
		this.phoneNo = phoneNo;
		this.relation = relation;
	} 
    
    
 }
