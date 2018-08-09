package com.learngn.springdatajpa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class CustomerEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long customerId;
	
	private String customerName;
	private String customerEmail;
	
	@Embedded
	private AddressEntity address;
	
	@OneToMany(mappedBy = "customer", cascade=CascadeType.ALL)
	List <PhoneNumber> phoneNumber;
	
	/* ________________________________________________________ */

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public List<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	
	
	public void addPhoneNumber(PhoneNumber number) {
		if (number != null) {
			if (phoneNumber == null) {
				phoneNumber = new ArrayList<PhoneNumber>();
			}
			number.setCustomer(this);
			phoneNumber.add(number);
		}
	}
}
