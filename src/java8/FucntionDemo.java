package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FucntionDemo {

	public static void main(String[] args) {
		Function<Employee, String> f = (e) -> {return e.getName();};
		List<Employee> emps = Arrays.asList(new Employee(1, "a"),new Employee(2, "b"),new Employee(3, "c"));
		List<String> ll = convertToNames(emps, f);
		
		ll.forEach(System.out::println);
	}
	
	public static List<String> convertToNames(List<Employee> list, Function<Employee, String> f){
		return list.stream().map(f).collect(Collectors.toList());
	}
}
