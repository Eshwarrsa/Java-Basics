package oops;

public class User1 {
	public static void main(String[] args) {
		Singleton c1 = Singleton.getObject();
		Singleton c2 = Singleton.getObject();
		
		c1.book(50);
		c2.book(50);
	}
}
