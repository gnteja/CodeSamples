package com.learngn.springdependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learngn.springdependencyinjection.service.AutowireByType;
import com.learngn.springdependencyinjection.service.AutowireService;

@SpringBootApplication
public class SpringDependencyInjectionLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDependencyInjectionLearnApplication.class, args);
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("BeanConfig.xml");
		
		AutowireService AutowireServicebyName = ctx.getBean("AutowireServicebyName", AutowireService.class);
		System.out.println(AutowireServicebyName.getAutowired().getName());
		
		
		AutowireService AutowireServicebyType = ctx.getBean("AutowireServicebyType", AutowireService.class);
		System.out.println(AutowireServicebyType.getAutowired().getName());
		
		
		AutowireService AutowireServicebyConstructor = ctx.getBean("AutowireServicebyConstructor", AutowireService.class);
		System.out.println(AutowireServicebyConstructor.getAutowired().getName());
	}
}
