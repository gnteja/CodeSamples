package com.learngn.junitandmockitolearn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.learngn.junitandmockitolearn.mockitoscrapbook.ClassA;
import com.learngn.junitandmockitolearn.mockitoscrapbook.ClassB;

import static org.mockito.Mockito.*;

public class ClassATest {
	
	@Mock
	ClassB b;
	
	private ClassA classA;
	
	@Before
	public void setup() {
		
		MockitoAnnotations.initMocks(this);
		classA = new ClassA(b);
	}
	
	@Test
	public void usesVoidMethodShouldCallVoidMethod() throws Exception {
	
		doNothing().when(b).voidMethod();
		classA.usesVoidMethodInClassB();
		verify(b).voidMethod();
	}
	
	@Test
	public void useVoidMethodStudOutExplicitily() throws Exception{
		doNothing().when(b).voidMethod();
		assertSame(1, classA.usesVoidMethodInClassB());
		verify(b).voidMethod();
	}
	
	@Test(expected = RuntimeException.class)
	public void voidMethodThrowsRuntimeException() throws Exception{
		doThrow(Exception.class).when(b).voidMethod();
		classA.usesVoidMethodInClassB();
		verify(b).voidMethod();
	} 

	@Test(expected = RuntimeException.class)
	public void voidMethodConsecutiveCallsThrowsRuntimeException() throws Exception{
		doNothing().doThrow(Exception.class).when(b).voidMethod();
		classA.usesVoidMethodInClassB();
		verify(b).voidMethod();
		classA.usesVoidMethodInClassB();	
	} 
}
