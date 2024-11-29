package oops;

public class Singleton {
	private int  seats;
	private static Singleton n; 
	
	private Singleton() {
		seats = 250;
	}
	
	public static Singleton getObject() {
		if (n == null) n = new Singleton();
		return n;
	}
	
	public void book(int num) {
		seats -= num;
		System.out.println(seats);
	}
}
