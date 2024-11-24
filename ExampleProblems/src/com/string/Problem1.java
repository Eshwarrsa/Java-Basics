package com.string;
/*
 * ## 1. Reverse a String
**Problem:** Write a program to reverse a given string.  
**Sample Input:** `"hello"`  
**Sample Output:** `"olleh"`
 */
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the String");
			String s1 = scn.next();
			System.out.println(s1);
			s1 = reverse(s1);
			System.out.println(s1);
			
		}
		
	}
	
	public static String reverse(String s) {
		String temp = "";
		for (int i = 0; i < s.length(); temp = s.charAt(i) + temp, i++);
		return temp;
		
	}
	
}
