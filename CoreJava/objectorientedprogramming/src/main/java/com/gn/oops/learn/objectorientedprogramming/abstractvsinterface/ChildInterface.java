package com.gn.oops.learn.objectorientedprogramming.abstractvsinterface;

public interface ChildInterface extends InterfaceExtension, SecondInterface {

	static void methodext() {
		System.out.println("Interface extended 2 Interfaces ");
	}
}
