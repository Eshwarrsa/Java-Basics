package clone;

public class Address implements Cloneable{
	String street;
	String city;
	
	Address(String street, String city){
		this.street = street;
		this.city = city;
	}
	
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
}
