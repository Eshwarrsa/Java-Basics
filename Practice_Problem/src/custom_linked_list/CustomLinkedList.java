package custom_linked_list;

public class CustomLinkedList {
	private Node first, last;
	private int count;
	
	public void add(Object ele) {
		if (first == null) {
			first = new Node(ele);
			count++;
			last = first;
			return;
		}
		last.next = new Node(ele);
		last = last.next;
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public Object get(int i) {
		if (i < 0 && i >= size()) throw new ArrayIndexOutOfBoundsException();
		Node curr = first;
		for (int ind = 1; ind <= i; ind++) {
			curr = curr.next;
		}
		return curr.ele;
	}
	
	public void display() {
		Node curr = first;
		for (int i = 0; i < size(); i++) {
			System.out.print(curr.ele + " ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public void remove(int index) {
		if (index < 0 && index >= size()) throw new ArrayIndexOutOfBoundsException();
		if (index == 0) {
			first = first.next;
			count--;
			return;
		}
		
		Node curr = first;
		for (int i = 1; i < index; i++) curr = curr.next;
		curr.next = curr.next.next;
		count--;
	}
}
