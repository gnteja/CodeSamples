package com.learngn.springcorelearn.springbean;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	
	private Point Center;

	public Point getCenter() {
		return Center;
	}

	@Required
	public void setCenter(Point center) {
		Center = center;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle Points is : "+ Center.getX() + "\t"+Center.getY());
		
	}

}
