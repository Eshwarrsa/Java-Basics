package string_program;

/*
### Problem: Reverse a String  

Write a program to reverse a given string without using any built-in reverse functions.  
The program should handle edge cases like empty strings and strings with special characters.  

#### Example:
- **Input:** `"Hello, World!"`
- **Output:** `"!dlroW ,olleH"`
 */

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the String : ");
			String word = scn.nextLine();
			System.out.println(reverse(word));
		}
	}
	
	public static String reverse(String word) {
		if (word == "" || word.length() == 1)
			return word;
		
		StringBuilder res = new StringBuilder();
		for (int i = word.length() - 1; i >= 0 ; res.append(word.charAt(i)), i--);
		return res.toString();
	}
}
