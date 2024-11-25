package com.number_program;
/*
 * **Check if a number is an Armstrong number**  
   - Input: `153`  
   - Output: `153 is an Armstrong number.`  
 */

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)){
			System.out.print("Enter the Number : ");
			int num = scn.nextInt();
			System.out.println(armstrong(num) ? "Armstrong Number" : "Not a Armstrong Number");
		}
	}
	
	public static boolean armstrong(int num) {
		if (num < 1) return false;
		
		int temp = num, res = 0, power = (int) Math.log10(num) + 1; 
		
		for (; temp > 0; temp /= 10)
			res += (int) Math.pow(temp % 10, power);
		
		return num == res;
	}
}