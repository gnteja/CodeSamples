package com.learngn.junitandmockitolearn;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ListTest {
	
	@Mock
	List <String> myList = new ArrayList<>();
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		myList.add("Bharath");
		myList.add("Teja");
		
		//Mockito.when(myList.size()).thenCallRealMethod();
		Mockito.doReturn(3).when(myList).size();
		assertSame(3, myList.size());
	}

}
