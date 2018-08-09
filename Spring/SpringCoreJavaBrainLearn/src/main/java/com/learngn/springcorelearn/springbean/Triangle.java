package com.learngn.springcorelearn.springbean;

public class Triangle implements Shape {
	
	private String type;
	
	private String height;
	
	public String getHeight() {
		return height;
	}

	public Triangle(String height) {
		this.height = height;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println("Triangle is drawn");
	}

}
