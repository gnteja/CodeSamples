package com.learngn.springdatajpa.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learngn.springdatajpa.entity.CustomerEntity;
import com.learngn.springdatajpa.repository.CustomerRepo;

@Transactional
@Service
public class CustomerDto {

	CustomerRepo customerRepo;
	
	public CustomerDto(CustomerRepo customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}

	public void saveCustomerInfo(CustomerEntity customerData) {
		System.out.println(customerData.getCustomerEmail());
		customerRepo.save(customerData);
	}
}
