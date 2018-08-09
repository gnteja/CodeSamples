package com.learngn.springdatajpa.onetoone.repository;

import org.springframework.data.repository.CrudRepository;

import com.learngn.springdatajpa.onetoone.entity.License;

public interface LicenseRepo extends CrudRepository<License, Long> {

}
