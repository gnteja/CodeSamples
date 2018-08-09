package com.gn.oops.learn.objectorientedprogramming.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintNonRepeatationString {

	public static void main(String[] args) {
		
		String toBeModified = "thisisthestring";
		
		PrintNonRepeatationString name = new PrintNonRepeatationString();
		name.usingContainsMethod(toBeModified);
		System.out.println();
		name.usingHash(toBeModified);
	}
	
	public void usingContainsMethod(String toBeModified) {
		List <String> stringArray = new ArrayList<String>();
		for (int  i =0; i < toBeModified.length() ; i++) {
			if (!stringArray.contains(String.valueOf(toBeModified.charAt(i)))){
				stringArray.add(String.valueOf(toBeModified.charAt(i)));
			}	
		}
		for (String string : stringArray) {
			System.out.print(string);
		}
	}
	
	public void usingHash(String myString) {
		Map<Integer,Character> someHashMap = new HashMap<Integer,Character>();
		for (int  i =0; i < myString.length() ; i++) {
			if(someHashMap.get(String.valueOf(myString.charAt(i)).hashCode())==null) {
			someHashMap.put(String.valueOf(myString.charAt(i)).hashCode(), myString.charAt(i));
			}
		}
		for (int i  : someHashMap.keySet()) {
			System.out.print(someHashMap.get(i));
		}
	}
}

