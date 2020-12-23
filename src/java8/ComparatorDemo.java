package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee(2, "a"),new Employee(1, "b"),new Employee(4, "c"),new Employee(3, "d"));
		
		emps.forEach(System.out::println);
		
		//rule 1 to sort list using comparator
		Comparator<Employee> id = Comparator.comparing(e -> e.getId());
		
		emps.sort(id);
		emps.forEach(System.out::println);
		
		//s
		Comparator<Employee> cmprtr = (o1, o2) -> {return o1.getName().compareTo(o2.getName());};
		
		emps.sort(cmprtr);
		
		emps.forEach(System.out::println);
		
		Comparator<Employee> name = Comparator.comparing(e -> e.getName());
		emps.sort(name.reversed());
		
		emps.forEach(System.out::println);
		
		System.out.println("================================================");
		emps.sort(name.thenComparing(id));
		
		emps.forEach(System.out::println);
		
	}
}
