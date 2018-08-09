package com.learngn.springdependencyinjection.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;


public class HelloMessageGeneratorScope {
	

	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	/*
	
	@Bean
	@Scope(value = WebApplicationContext.SCOPE_REQUEST,
				proxyMode = ScopedProxyMode.TARGET_CLASS)
	public HelloMessageGeneratorScope requestMessage() {
		return new HelloMessageGeneratorScope();
	}
	
	@Bean
	@Scope(value = WebApplicationContext.SCOPE_SESSION,
				proxyMode = ScopedProxyMode.TARGET_CLASS)
	public HelloMessageGeneratorScope sessionMessage() {
		return new HelloMessageGeneratorScope();
	}
	
	@Bean
	public HelloMessageGeneratorScope globalSessionMessage() {
		return new HelloMessageGeneratorScope();
	}
  
 */
}
