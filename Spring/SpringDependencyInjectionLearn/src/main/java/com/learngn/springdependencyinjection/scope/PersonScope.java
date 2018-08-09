package com.learngn.springdependencyinjection.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PersonScope {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public PersonScope personSingleton(String name) {
	    return new PersonScope();
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PersonScope personPrototype() {
	    return new PersonScope();
	}

}
