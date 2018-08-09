package com.gn.java.learn.collections.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ListInterface {
	
	public static void main(String[] args) {
		ListInterface interfaceList = new ListInterface();
		interfaceList.mapInterfaceExample();
	}
	
	public void arrayListExample() {
		
		List<String> numberArray = new ArrayList<String>(); 
		numberArray.add("one");
		numberArray.add("two");
		numberArray.add("three");
		numberArray.add("four");
		numberArray.add("five");
		
		//remove method
		numberArray.remove("five");
		
		for (String string : numberArray) {
			System.out.println(string);
		}
	}
	
	public void linkedListExample() {
		
		Queue <String> numberLinkedlist = new LinkedList<String>();
		
		numberLinkedlist.add("one");
		numberLinkedlist.add("two");
		numberLinkedlist.add("three");
		numberLinkedlist.add("four");
		numberLinkedlist.add("five");
		
		//retrieves the first element without deleting if empty returns null
		System.out.println(numberLinkedlist.peek());
		//retrieves the element and deletes it / if empty returns null
		System.out.println(numberLinkedlist.poll());
		System.out.println(numberLinkedlist.peek());
	}
	
	public void mapInterfaceExample() {
		Map<String, Integer> mapInterface= new HashMap <String, Integer>();
		mapInterface.put("One", 1);
		mapInterface.put("two", 2);
		mapInterface.put("Three", 3);
		
		System.out.println(mapInterface.get("two"));
		System.out.println(mapInterface.containsValue(2));
	}
}