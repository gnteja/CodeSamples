package com.learngn.springaspectedorientedprogramminglearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learngn.springaspectedorientedprogramminglearn.aspects.Loggable;
import com.learngn.springaspectedorientedprogramminglearn.service.CustomerService;

@RestController
public class WebController {
	
	@Autowired
	CustomerService customerService;
	
	   @RequestMapping("/aspectlog")
	   @Loggable
	    public String loggableAspect(){   	
	    	try {
				return customerService.getCustomerById(1);
			} catch (Exception e) {
				System.out.println("caught error in controller");
				e.printStackTrace();
				return null;
			}
	    }

}
