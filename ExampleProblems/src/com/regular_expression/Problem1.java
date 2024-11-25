package com.regular_expression;
/*
 * 1. Match a word containing only lowercase letters.  
   - **Input:** `hello123`  
   - **Output:** `hello`
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the String");
			String s = scn.nextLine();
			Pattern p = Pattern.compile("[a-z]+");
			Matcher m = p.matcher(s);
			while(m.find())
				System.out.println(m.group());
		}
	}
}