package com.learngn.springdatajpa.transactionmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount {
	
	@Id
	private int accNo;
	private String name;
	private int bal;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}

}
