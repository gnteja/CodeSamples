package com.gn.oops.learn.objectorientedprogramming.abstractvsinterface;

public interface InterfaceExtension {
	
	default void defaultMethod(String name ) {
		System.out.println("the passed to the default method ");
	}

}
