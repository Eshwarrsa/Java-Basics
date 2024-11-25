package com.array;
/*
 * ## 2. Find the Smallest Element in an Array
**Problem:** Write a program to find the smallest element in an array.  
**Sample Input:** `[5, 2, 9, 1, 5, 6]`  
**Sample Output:** `1`
 */

public class Problem2 {
	public static void main(String[] args) {
		int [] arr = ArrayLoaderInt.arrayLoader();
		int small = smallElement(arr);
		System.out.println(small);
				
	}
	
	public static int smallElement(int[] arr) {
		int small = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < small) small = arr[i];
			
		}
		return small;
		
	}
	
}
