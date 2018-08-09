package com.learngn.springcorelearn.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingTwo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		
		PointTriangle pointTriangle = (PointTriangle) context.getBean("pointTriangle");
		pointTriangle.draw();
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		//System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
		
		
		
		//coding to Interface for the above methods 
		
		Shape shape1 = (Shape) context.getBean("pointTriangle");
		shape1.draw();
		
		Shape shape2 = (Shape) context.getBean("circle");
		shape2.draw();
	}

}
