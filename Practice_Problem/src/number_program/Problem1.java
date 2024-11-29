package number_program;

/*
 ### Problem: Sum of Digits in a Number  

Write a program to compute the sum of digits of a given integer number.  
If the input is negative, consider only the absolute value of the number.

#### Example:
- **Input:** `n = -123`
- **Output:** `6`  
 */

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		// Try block to auto close and check Scanner works correctly 
		try (Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the Number : ");
			int number = scn.nextInt();
			System.out.println(sumOfDigits(number));
		}
	}
	
	public static int sumOfDigits(int number) {
		// Condition to check given number is negative or not
		if (number < 0) number = Math.abs(number);
		int res = 0;
		for (;number > 0; res += number % 10, number /= 10); // Loop to calculate the sum of the individual digit
		return res; // Returning result in integer type
	}
}
