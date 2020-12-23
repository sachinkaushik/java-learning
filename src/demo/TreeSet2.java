package demo;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>(new MyComparatorString());
		set.add("V");
		set.add("A");
		set.add("Z");
		set.add("B");
		set.add("E");
		
		System.out.println(set);
	}
}
