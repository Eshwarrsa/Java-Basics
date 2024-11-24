package com.array;
/*
 * ## 1. Find the Largest Element in an Array
**Problem:** Write a program to find the largest element in an array.  
**Sample Input:** `[5, 2, 9, 1, 5, 6]`  
**Sample Output:** `9`
 */

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the Length");
			int size = scn.nextInt();
			int[] arr = new int[size];
			
			for (int i = 0; i < size; arr[i] = scn.nextInt(), i++);
			
			int high = highestInArray(arr);
			System.out.println(high);
			
		}
		
		
	}
	
	public static int highestInArray(int[] arr) {
		int high = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (high < arr[i])
				high = arr[i];
			
		}
		return high;
		
	}
	
}
