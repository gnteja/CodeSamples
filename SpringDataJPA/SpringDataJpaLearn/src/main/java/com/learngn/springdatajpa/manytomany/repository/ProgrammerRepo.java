package com.learngn.springdatajpa.manytomany.repository;

import org.springframework.data.repository.CrudRepository;

import com.learngn.springdatajpa.manytomany.entity.Programmer;

public interface ProgrammerRepo extends CrudRepository<Programmer, Integer> {
	
	
}
