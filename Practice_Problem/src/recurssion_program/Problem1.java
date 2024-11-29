package recurssion_program;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the Number : ");
			int num = scn.nextInt();
			System.out.println(nthFibinacciSeries(num, 0, 1));
		}
	}
	
	public static int nthFibinacciSeries(int num, int a, int b) {
		if (num == 0) return a;
		return nthFibinacciSeries(--num, b, a + b);
	}
}
