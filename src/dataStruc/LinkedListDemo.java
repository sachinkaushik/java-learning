package dataStruc;

public class LinkedListDemo {

	Node head; // head of list
	
	static class Node{
		Object item;
		Node next;
		
		Node(Object item){
			this.item = item;
			next = null;
		}
	}
	
	public void add(Object item) {
		Node newNode = new Node(item);
		
		if(head == null) {
			head = newNode;
		}
		else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}
	
	public static void print(LinkedListDemo list) {
		Node node = list.head;
		while(node != null) {
			System.out.println(node.item);
			node = node.next;
		}
	}
	public static void main(String[] args) 
    { 
        /* Start with the empty list. */
		LinkedListDemo list = new LinkedListDemo();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		print(list);
    }
}
