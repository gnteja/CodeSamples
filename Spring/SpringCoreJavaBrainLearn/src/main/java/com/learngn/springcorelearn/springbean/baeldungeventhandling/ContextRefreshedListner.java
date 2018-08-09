package com.learngn.springcorelearn.springbean.baeldungeventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshedListner implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent cse) {
		System.out.println("Handling context re-freshed event. ");
		
	}

}
