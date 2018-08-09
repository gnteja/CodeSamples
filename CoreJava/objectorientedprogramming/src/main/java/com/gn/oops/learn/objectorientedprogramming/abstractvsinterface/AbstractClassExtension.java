package com.gn.oops.learn.objectorientedprogramming.abstractvsinterface;

abstract class AbstractClassExtension {
	
	String name = "teja";
	
	abstract void abstractMethod();
	
	public void publicMethod() {
		System.out.println("the name passed to the abstract public method "+name);
	}	
}
