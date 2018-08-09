package com.learngn.springaspectedorientedprogramminglearn.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.learngn.springaspectedorientedprogramminglearn.aspects.Loggable;
import com.learngn.springaspectedorientedprogramminglearn.model.Customer;

@Component
public class CustomerService {
	
	private static Map<Long, Customer> store = new HashMap<Long, Customer>();
	static {
		store.put(1L, new Customer(1, "Jack", "Smith"));
		store.put(2L, new Customer(2, "Adam", "Johnson"));
	}
 

	@Loggable
	public String getCustomerById(long id) throws Exception {	
		return store.get(id).getFirstName();
	}
 
	public String getCustomerMethod(long id) {
		return "using get customer method "+ id;
	}
}


