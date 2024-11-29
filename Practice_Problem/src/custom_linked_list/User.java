package custom_linked_list;

public class User {
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.display(); // Output: 10 -> 20 -> 30
		System.out.println(list.get(1)); // Output: 20
		list.remove(1);
		list.display(); // Output: 10 -> 30

	}
}
