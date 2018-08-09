package com.gn.oops.learn.objectorientedprogramming.algo;

public class Palindrome {

	public static void main(String[] args) {
		
		String palindrome = "hellolleh";
		
		Palindrome palindromeClass = new Palindrome();
		palindromeClass.checkPalindrome(palindrome);

	}
	
	public boolean checkPalindrome(String palindrome) {
		boolean palindromeState = false;
		for(int i =0; i < palindrome.length(); i++) {
			if (palindrome.charAt(i) == palindrome.charAt(palindrome.length() -i-1));
			else {return palindromeState;}
		}
		palindromeState = true;	
		return palindromeState;
	}
}
