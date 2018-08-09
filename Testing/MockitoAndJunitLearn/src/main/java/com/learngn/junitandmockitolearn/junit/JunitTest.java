package com.learngn.junitandmockitolearn.junit;

public class JunitTest {

	public String greetingTest(String name) {
		if (name == null || name == "") {
			throw new IllegalArgumentException();
		}
		return "hello "+ name;
	}
}
