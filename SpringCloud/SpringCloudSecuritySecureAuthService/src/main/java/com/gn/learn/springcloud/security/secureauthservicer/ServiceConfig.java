package com.gn.learn.springcloud.security.secureauthservicer;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class ServiceConfig extends GlobalAuthenticationConfigurerAdapter{
	
	@Override
	public void init(AuthenticationManagerBuilder auth)throws Exception {
		auth.inMemoryAuthentication()
			.withUser("test")
			.password("{noop}test")
			.roles("USER")
			.and()
			.withUser("guest")
			.password("{noop}guest")
			.roles("USER", "DEVELOPER");
	}

}
