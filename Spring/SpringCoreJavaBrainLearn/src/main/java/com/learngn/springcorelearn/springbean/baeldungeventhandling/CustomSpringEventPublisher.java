package com.learngn.springcorelearn.springbean.baeldungeventhandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

public class CustomSpringEventPublisher {
	
   @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
 
    public void doStuffAndPublishAnEvent(final String message) {
        System.out.println("Publishing custom event. ");
        
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }

}
