package clone;

public class Person implements Cloneable {
	String name;
	int age;
	Address address;
	
	
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public Person clone() throws CloneNotSupportedException{
		Person cloned = (Person) super.clone();
		cloned.address = address.clone();
		return cloned;
	}
}
