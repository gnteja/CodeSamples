package com.learngn.springdependencyinjection.entity;

import org.springframework.stereotype.Component;

@Component
public class EntityTobeAutowired {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

}
