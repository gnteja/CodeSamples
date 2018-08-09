package com.learngn.springdatajpa.transactionmanagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learngn.springdatajpa.transactionmanagement.entity.BankAccount;
import com.learngn.springdatajpa.transactionmanagement.repository.BankAccountRepo;

@Service
public class BankAccountService {
	
	@Autowired
	BankAccountRepo bankAccountRepo;
	
	
	//@Transactional annatotion is used to make the method transactional.
	@Transactional
	public void transfer(int amount) {
		
		/*
		
		BankAccount senderProfile = bankAccountRepo.findById(1);
		senderProfile.setBal(senderProfile.getBal() - amount);
		bankAccountRepo.save(senderProfile);
		
		BankAccount receiverProfile = bankAccountRepo.findById(1);
		receiverProfile.setBal(receiverProfile.getBal() + amount);
		bankAccountRepo.save(receiverProfile);
		
		*/
		
	}

}
