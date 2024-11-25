package com.string;
/*
 * ## 2. Count the Vowels in a String
**Problem:** Write a program to count the number of vowels in a string.  
**Sample Input:** `"hello world"`  
**Sample Output:** `3`
 */

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the Word");
			String s1 = scn.nextLine();
			int numberOfVowels = countVowels(s1);
			System.out.println(numberOfVowels);
			
		}
		
	}
	
	public static int countVowels(String s) {
		int count = 0;
		char[] arr = s.toCharArray();
		char[] vowels = "aeiouAEIOU".toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < vowels.length; j++)
				if(arr[i] == vowels[j]) count++;
			
		}
		return count;
		
	}
	
}
