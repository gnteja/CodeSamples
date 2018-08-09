package com.learngn.springdependencyinjection.service;

import org.springframework.stereotype.Service;

import com.learngn.springdependencyinjection.entity.EntityTobeAutowired;


public class AutowireService {

	//Autowire using Constructor 
	
	private EntityTobeAutowired autowired;

	//constructor is used for autowire by constructor

	public AutowireService(EntityTobeAutowired autowired) {
		System.out.println("Autowired by constructor used");
		this.autowired = autowired;
	}
	
	//Default constructor used for autowire byName or byType
	//To avoid BeanInstantiationException
	
	public AutowireService() {
		System.out.println("Default constructor used");
	}
	
	//used for autowire byName and byType
	
	public void setAutowired(EntityTobeAutowired autowired) {
		this.autowired = autowired;
	}
	
	public EntityTobeAutowired getAutowired() {
		return autowired;
	}	
}
