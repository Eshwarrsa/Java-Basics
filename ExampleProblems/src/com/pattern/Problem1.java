package com.pattern;

/*
 * 1. **Print a right-angled triangle of stars**  
   - Input: `4`  
   - Output:  
     ```
     *  
     **  
     ***  
     ****  
     ```  
 */

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the number of line : ");
			int line = scn.nextInt();
			
			for (int i = 1; i <= line; i++) {
				for (int j = 1; j <= i; j++)
					System.out.print("*");
				System.out.println();
				
			}
			
		}
		
	}
	
}
