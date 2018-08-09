package com.gn.oops.learn.objectorientedprogramming.inheritance;

public class ChildExtendingAbstractClass extends AbstractClass implements SuperInterface{

	@Override
	public void abstractMethod() {
		System.out.println("implementing Abstract method");
	}

	public void implementationMethod() {
		System.out.println("implementing implementation method");
	}

}
