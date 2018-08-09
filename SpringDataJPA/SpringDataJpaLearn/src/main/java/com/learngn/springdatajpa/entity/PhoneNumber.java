package com.learngn.springdatajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String phNumner;
	private String phType;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;
	
	
	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhNumner() {
		return phNumner;
	}

	public void setPhNumner(String phNumner) {
		this.phNumner = phNumner;
	}

	public String getPhType() {
		return phType;
	}

	public void setPhType(String phType) {
		this.phType = phType;
	}
}
