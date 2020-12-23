package dataStruc;

public class LinkedListDemo1 {

	static Node head;
	
	static class Node{
		Object item;
		Node next;
		
		Node(Object item){
			this.item = item;
			this.next = null;
		}
	}
	
	private Node addRecursive(Node node, Object item) {
		if(node == null) {
			node = new Node(item);
		}else {
			node.next = addRecursive(node.next, item);
		}
		return node;
	}
	
	public void add(Object item) {
		head = addRecursive(head, item);
	}
	
	public void print() {
		Node node = head;
		while(node != null) {
			System.out.println(node.item);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListDemo1 ll = new LinkedListDemo1();
		ll.add(1);
		ll.add(22);
		
		ll.print();
	}
}
