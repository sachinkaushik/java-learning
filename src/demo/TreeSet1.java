package demo;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> l = new TreeSet<>();
		l.add("B");
		l.add("Z");
		l.add("A");
		
		System.out.println(l);
		
		TreeSet<Integer> ll = new TreeSet<>(new MyComparator());
		ll.add(2);
		ll.add(12);
		ll.add(0);
		ll.add(22);
		ll.add(32);
		
		System.out.println(ll);
	}
}
