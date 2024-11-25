package com.array;

import java.util.Scanner;

public class ArrayLoaderInt{
	public static int[] arrayLoader() {
		try (Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the length of the array");
			int size = scn.nextInt();
			int[] arr = new int[size];
			
			for (int i = 0; i < size; i++) {
				System.out.print("Enter the number in index " + i + " :");
				arr[i] = scn.nextInt();
				System.out.println();
				
			}
			return arr;
			
		}
		
	}
}
