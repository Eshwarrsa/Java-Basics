package custom_array_list;

public class User {
	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.get(1)); // Output: 20
		list.remove(1);
		System.out.println(list.get(1)); // Output: 30
		System.out.println(list.size()); // Output: 2

	}
}
