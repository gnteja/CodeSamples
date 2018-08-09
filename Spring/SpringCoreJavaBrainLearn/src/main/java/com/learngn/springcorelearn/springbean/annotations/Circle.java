package com.learngn.springcorelearn.springbean.annotations;

import javax.annotation.Resource;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.learngn.springcorelearn.springbean.Point;
import com.learngn.springcorelearn.springbean.annotations.Shape;
import com.learngn.springcorelearn.springbean.eventhandling.DrawEvent;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
	
	private Point center;
	
	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("circle point is : " +center.getX() +"\t"+center.getY());
		
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);

	}
}
