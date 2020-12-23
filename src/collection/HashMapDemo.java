package collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Employee, Integer> map = new HashMap<>();
		Employee e1 = new Employee(1, "a1");
		map.put(e1, 11);
		map.put(new Employee(2, "a2"), 22);
		map.put(new Employee(3, "a3"), 23);
		map.put(new Employee(1, "a1"), 24);
		map.put(new Employee(5, "a5"), 25);
		map.put(new Employee(6, "a6"), 26);
		map.put(new Employee(7, "a7"), 27);
		map.put(new Employee(8, "a8"), 28);
		map.put(new Employee(9, "a9"), 29);
		map.put(new Employee(10, "a10"), 210);
		
		System.out.println(map);
		System.out.println(map.get(e1));
		
		HashMap<Employee, Integer> map1 = new HashMap<>();
		Employee e11 = new Employee(1, "a1");
		map1.put(e11, 22);
		e11.setName("a2");
		
		System.out.println(map1.get(e1));
	}
}
