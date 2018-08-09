package com.learngn.springcorelearn.springbean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {
	/*
	 * ApplicationContext is preffered then BeanFactory as it has more applicable features
	 * 
	*/

	public static void main(String[] args) {
		
//		Triangle triangle = new Triangle();
//		triangle.draw();
		
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springTest.xml"));
//		Triangle triangle = (Triangle)factory.getBean("triangle");
//		triangle.draw();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle) context.getBean("simpleTriangle");
		triangle.draw();
		System.out.println(triangle.getType() +"\t" +triangle.getHeight());
		
		
		PointTriangle pointTriangle = (PointTriangle) context.getBean("pointTriangle");
		pointTriangle.draw();
		
		
		CollectionTriangle collectionTriangle = (CollectionTriangle) context.getBean("collectionTriangle");
		collectionTriangle.draw();
		
		
		PointTriangle autowiringPointTriangle = (PointTriangle) context.getBean("autowiringPointTriangle");
		autowiringPointTriangle.draw();
		
		//Bean Definition Inheritance
		
		PointTriangle childPointTriangle = (PointTriangle) context.getBean("childPointTriangle");
		childPointTriangle.draw();
		
		CollectionTriangle childCollectionTriangle = (CollectionTriangle) context.getBean("childCollectionTriangle");
		childCollectionTriangle.draw();
		
		//Bean Definition Inheritance 3 classes
		
		CollectionTriangle childCollectionTriangleThree = (CollectionTriangle) context.getBean("childCollectionTriangleThree");
		childCollectionTriangleThree.draw();
		
		
	}

}
