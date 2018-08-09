package com.learngn.springdependencyinjection.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.learngn.springdependencyinjection.entity.EntityTobeAutowired;

public class AutowireByConstructor {

	private EntityTobeAutowired autowired;
	
	@Autowired(required=false)
	public AutowireByConstructor(@Qualifier("autowired") EntityTobeAutowired autowire) {
		super();
		this.autowired = autowire;
	}

	public EntityTobeAutowired getAutowired() {
		return autowired;
	}
}
