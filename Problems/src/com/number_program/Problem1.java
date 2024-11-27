package com.number_program;

import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the Number");
			System.out.println(isPrime(scn.nextInt()) ? "Prime Number" : "Not a Prime Number");
		}
	}
	
	public static boolean isPrime(int num) {
		if (num <= 1) return false;
		
		for (int i = 2; i * i <= num; i++) 
			if (num % i == 0) return false;
		return true;
	}
}
