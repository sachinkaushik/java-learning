package collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();
		m.put(100, "Hello");
		m.put(101, "Geeks");
		m.put(102, "Geeks");
		
		System.out.println(m);
		
		m.putIfAbsent(101, "sachin");
		
		System.out.println(m);
		
		m.putIfAbsent(105, "sharma");
		
		System.out.println(m);
		
	}
}
