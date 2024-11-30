package clone;

public class User {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person person1 = new Person("Alice", 25, new Address("123 Main St", "New York"));
		Person person2 = person1.clone(); // Clone the person object
		
		System.out.println(person1);
		System.out.println(person2);
		person2.name = "Bob";
		System.out.println(person1);
		System.out.println(person2);
	}
}