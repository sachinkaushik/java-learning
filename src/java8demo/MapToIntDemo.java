package java8demo;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class MapToIntDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(sum(list));
		
	}

	 public static int sum(ArrayList<Integer> list) {
		 
		 OptionalDouble average = list.stream().mapToInt( n -> n*n).filter( n -> n > 500).average();
		 
		 if(average.isPresent()) {
			 System.out.println(average.getAsDouble());
		 }
		 return list.stream().mapToInt( i-> i).sum();
	        // Found the total using sum() method after 
	        // converting it into Stream
	    }
}
