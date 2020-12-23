package concurrency;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		
		for(Integer i : al) {
			System.out.println(i);
			al.add(4);
		}
		
	}
}
