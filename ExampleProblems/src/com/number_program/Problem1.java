package com.number_program;

/*
 * 1. **Check if a number is prime**  
   - Input: `29`  
   - Output: `29 is a prime number.`  
 */

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the Number : ");
			System.out.println(isPrime(scn.nextInt()) ? "Prime Number" : "Not a Prime Number");
			
		}
		
	}
	
	public static boolean isPrime(int num) {
		if (num <= 1) return false;
		
		for (int divisor = 2; divisor * divisor <= num; divisor++)
			if (num % divisor == 0) return false;
		
		return true;
		
	}
	
}
