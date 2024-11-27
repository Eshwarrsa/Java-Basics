package com.array_list;

public class User {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		for (int i = 0; i <= 10; l.add(i++)); 
		for (int i = 0; i < l.size(); System.out.print(l.get(i++) + " "));
		l.remove(5);
		System.out.println();
		for (int i = 0; i < l.size(); System.out.print(l.get(i++) + " "));
		l.add(5, 5);
		System.out.println();
		for (int i = 0; i < l.size(); System.out.print(l.get(i++) + " "));
		
	}
}
