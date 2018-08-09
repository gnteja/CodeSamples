package com.learngn.springdependencyinjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learngn.springdependencyinjection.scope.entity.Customer;

@RestController
public class WebControllerScope {
	
	@Autowired
	private Customer customer;
 
	@RequestMapping("/address")
	public String address() {
		String result = customer.getAddress();
		customer.setAddress("EU");
		return "init Data: " + result + "|-----| modified Data: " + customer.getAddress();
	}
 
	@RequestMapping("/addresscheck")
	public String addresscheck() {
		return "check Data: " + customer.getAddress();
	}
 
	@RequestMapping("/age")
	public String age() {
		String result = customer.getAge();
		customer.setAge("25");
		return "init Data: " + result + "|-----| modified Data: " + customer.getAge();
	}
 
	@RequestMapping("/agecheck")
	public String agecheck() {
		return "check Data: " + customer.getAge();
	}

}
