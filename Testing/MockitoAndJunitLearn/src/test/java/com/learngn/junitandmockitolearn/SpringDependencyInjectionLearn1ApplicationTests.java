package com.learngn.junitandmockitolearn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.learngn.junitandmockitolearn.junit.JunitTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDependencyInjectionLearn1ApplicationTests {
	
	JunitTest testCase;
	
	@Before
	public void setup() {
		testCase = new JunitTest();
	}

	@Test
	public void greetingShouldReturnAValidOutput() {
		
		String result = testCase.greetingTest("Junit");
		
		assertNotNull(testCase);
		assertEquals("hello Junit", result);	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetingThrowException_for_NameisNull() {
		
		testCase.greetingTest(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetingThrowException_for_NameisBlank() {
		
		testCase.greetingTest("");
	}
	
	@After
	public void teradown() {
		testCase = null;
	}
}
