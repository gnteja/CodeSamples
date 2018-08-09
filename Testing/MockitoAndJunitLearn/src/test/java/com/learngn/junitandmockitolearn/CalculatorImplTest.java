package com.learngn.junitandmockitolearn;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.learngn.junitandmockitolearn.mockito.calculator.CalculatorImpl;

@RunWith(Parameterized.class)
public class CalculatorImplTest {
	
	int num1;
	int num2;
	int expectedResult;
	
	public CalculatorImplTest(int num1, int num2, int expectedResult) {
		this.num1 = num1;
		this.num2 = num2;
		this.expectedResult = expectedResult;
	}
	
	//Collection<Integer[]>
	@Parameters
	public static List<Object> data(){
		return Arrays.asList(new Integer[][] {{-1,2,1},{1,2,3}, {6,7,13}});
	}

	@Test
	public void addShouldReturnResult() {
		CalculatorImpl c = new CalculatorImpl();
		int result = c.add(num1, num2);
		assertEquals(expectedResult, result);
	}

}
