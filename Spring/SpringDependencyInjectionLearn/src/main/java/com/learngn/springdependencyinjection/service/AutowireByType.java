package com.learngn.springdependencyinjection.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.learngn.springdependencyinjection.entity.EntityTobeAutowired;

public class AutowireByType {
	
	//Autowired annotation on variable /setters is equivalent to autowire="byType"
	
	@Autowired
	private EntityTobeAutowired autowired;
	
	@Autowired
	public void setAutowired(EntityTobeAutowired autowired) {
		this.autowired = autowired;
	}

	public EntityTobeAutowired getAutowired() {
		return autowired;
	}

}
