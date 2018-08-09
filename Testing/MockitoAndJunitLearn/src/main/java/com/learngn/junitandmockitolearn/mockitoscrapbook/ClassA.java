package com.learngn.junitandmockitolearn.mockitoscrapbook;

public class ClassA {
	
	private ClassB b;

	public ClassA(ClassB b) {
		super();
		this.b = b;
	}
	
	public int usesVoidMethodInClassB() {
		try {
			b.voidMethod();
			
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}
		return 1;
	}
}
