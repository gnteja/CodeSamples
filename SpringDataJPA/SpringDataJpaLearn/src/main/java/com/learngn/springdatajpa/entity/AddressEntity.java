package com.learngn.springdatajpa.entity;

import javax.persistence.Embeddable;

@Embeddable
public class AddressEntity {

	private String doorNumber;
	private String street;
	private String state;

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
