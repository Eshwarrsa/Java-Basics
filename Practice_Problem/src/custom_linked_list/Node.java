package custom_linked_list;

public class Node {
	Object ele;
	Node next;
	
	public Node(Object ele) {
		this.ele = ele;
	}
	
	public Node(Object ele, Node next) {
		this(ele);
		this.next = next;
	}
}
