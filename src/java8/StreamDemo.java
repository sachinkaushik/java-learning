package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee(1, "a"),new Employee(2, "b"),new Employee(3, "c"));
		emps.stream().limit(2).collect(Collectors.toList()).forEach(System.out::println);;
	}
}
