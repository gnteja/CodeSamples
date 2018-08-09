package com.learngn.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learngn.springdatajpa.entity.CustomerEntity;

@Repository
@Transactional
public interface CustomerRepo extends CrudRepository<CustomerEntity, Long> {

}
