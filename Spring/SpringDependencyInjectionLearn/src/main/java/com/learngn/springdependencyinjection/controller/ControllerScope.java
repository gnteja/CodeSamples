package com.learngn.springdependencyinjection.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.learngn.springdependencyinjection.scope.HelloMessageGeneratorScope;


@Controller
public class ControllerScope {
	
/*	
	@Resource(name = "requestMessage")
	HelloMessageGeneratorScope requestMessage;
	
	@Resource(name = "sessionMessage")
	HelloMessageGeneratorScope sessionMessage;
	
	@GetMapping("/requestscope")
	public String getRequestScope() {
		requestMessage.setMessage("From get Request Scope");
		System.out.println(requestMessage.getMessage());
		return "Request Scope Example";
	}
	
	@GetMapping("/sessionscope")
	public String getSessionScope() {
		sessionMessage.setMessage("From get Session Scope");
		System.out.println(sessionMessage.getMessage());
		return "Session Scope Example";
	}	
	
	*/
}

