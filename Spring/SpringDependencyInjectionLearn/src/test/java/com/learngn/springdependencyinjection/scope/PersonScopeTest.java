package com.learngn.springdependencyinjection.scope;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Assert;


public class PersonScopeTest {

	private static final String NAME = "JAMES LEBBRON";
	private static final String NAME_OTHER = "MESSI LIONEAL";
	


	@Test
	public void givenSingletonScope_whenSetName_thenDifferentNames() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanScope.xml");
		
		PersonScope personSingletonA = (PersonScope) applicationContext.getBean("personSingleton");
		PersonScope personSingletonB = (PersonScope) applicationContext.getBean("personSingleton");
		
		personSingletonA.setName(NAME);
		
		assertEquals(NAME, personSingletonB.getName());
		((AbstractApplicationContext) applicationContext).close();
	}
	
	@Test
	public void givenPrototypeScope_whenSetName_thenEqualNames() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanScope.xml");
		
		PersonScope personPrototypeA = (PersonScope) applicationContext.getBean("personPrototype");
		PersonScope personPrototypeB = (PersonScope) applicationContext.getBean("personPrototype");
		
		personPrototypeA.setName(NAME);
		personPrototypeB.setName(NAME_OTHER);
		
	    assertEquals(NAME, personPrototypeA.getName());
	    assertEquals(NAME_OTHER, personPrototypeB.getName());
	    
	    ((AbstractApplicationContext) applicationContext).close();
		
	}

}
