package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> p = (String s) -> {
			return s.equals("test");
		};

		System.out.println(p.test("test"));
		System.out.println(p.test("sachin"));

		Predicate<Integer> positive = i -> i > 0;
		List<Integer> integerList = Arrays.asList(new Integer(1), new Integer(10), new Integer(200), new Integer(101),
				new Integer(-10), new Integer(0));
		List<Integer> filteredList = filterList(integerList, positive);
		filteredList.forEach(System.out::println);
		
		Predicate<Integer> ngtv = i -> i <= 0;
		List<Integer> filteredList1 = filterList(integerList, ngtv);
		filteredList1.forEach(System.out::println);
	}

	public static List<Integer> filterList(List<Integer> listOfIntegers, Predicate<Integer> predicate) {
		List<Integer> filteredList = new ArrayList<Integer>();
		for (Integer integer : listOfIntegers) {
			if (predicate.test(integer)) {
				filteredList.add(integer);
			}
		}
		
		return listOfIntegers.stream().filter(predicate).collect(Collectors.toList());
		//return filteredList;
	}
}
