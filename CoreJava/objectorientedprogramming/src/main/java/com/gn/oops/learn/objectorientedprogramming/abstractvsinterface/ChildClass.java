package com.gn.oops.learn.objectorientedprogramming.abstractvsinterface;

public class ChildClass extends AbstractClassExtension implements InterfaceExtension{

	@Override
	public void abstractMethod() {
		System.out.println("abstract method extended ");
	}

}
