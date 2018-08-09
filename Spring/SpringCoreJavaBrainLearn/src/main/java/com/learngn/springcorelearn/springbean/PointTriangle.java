package com.learngn.springcorelearn.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;

import com.learngn.springcorelearn.springbean.eventhandling.DrawEvent;

public class PointTriangle implements ApplicationContextAware, BeanNameAware, InitializingBean, 
										DisposableBean, ApplicationEventPublisherAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context;
	
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println(getPointA().getX() +"\t"+ getPointA().getY());
		System.out.println(getPointB().getX() +"\t"+ getPointB().getY());
		System.out.println(getPointC().getX() +"\t"+ getPointC().getY());
		System.out.println("******************");
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
		
		
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	//Implementation of BeanNameAware Interface
	@Override
	public void setBeanName(String beanName) {
		System.out.println(beanName + "the bean Name from the Point Triangle POJO");
		
	}
	
	//Implementation of ApplicationContextAware Interface
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
	}
	
	//Implementation of InitializingBean Interface
	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("InitializingBean method is called for Point Triangle");
	}
	//Implemented when the Bean is destroyed
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DestroyBean method is called for point Triangle");
		
	}
	
	public void myInit() {
		System.out.println("myInit method is called for Point Triangle");
	}
	
	public void myDestroy() {
		System.out.println("myDestroy method is called for Point Triangle");
	}
}
