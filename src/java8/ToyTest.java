package java8;

import java.util.ArrayList;
import java.util.List;

public class ToyTest {

	public static void main(String[] args) {

		List<Toy> toys = new ArrayList<>();
		toys.add(new Toy("red", 10));
		toys.add(new Toy("yellow", 10));
		toys.add(new Toy("red", 10));
		double totalPrice = toys.stream()
		 .filter(e -> e.getColor() == "red")
		 .mapToDouble( e-> e.getPrice())
		 .sum();
		System.out.println("Total Price of Red Toys: " + totalPrice);
	}

}
