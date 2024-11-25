package com.pattern;

/*
 * **Print an inverted right-angled triangle**  
   - Input: `4`  
   - Output:  
     ```
     ****  
     ***  
     **  
     *  
     ``` 
 */

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the Number");
			int num = scn.nextInt();
			
			for (; num > 0; num--) {
				for (int j = 0; j < num; j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
}
