package com.learngn.springdatajpa.transactionmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learngn.springdatajpa.transactionmanagement.entity.BankAccount;

@Repository
public interface BankAccountRepo extends CrudRepository<BankAccount, Integer> {

}
