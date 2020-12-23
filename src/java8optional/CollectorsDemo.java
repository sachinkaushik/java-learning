package java8optional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Harshi", 1));
		students.add(new Student(2, "Mishka", 2));
		students.add(new Student(3, "Gunnu", 3));
		students.add(new Student(1, "Priyal", 4)); 
		students.add(new Student(1, "Anika", 10));
		
		//method 1 : Collectors.toList();
		List<String> ss = students.stream().map(s -> s.getName().toUpperCase()).collect(Collectors.toList());
		ss.forEach(System.out::println);
	}

}
