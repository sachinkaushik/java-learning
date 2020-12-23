package collection;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTest {


	public static void main(String args[]) { 
		
		//creating List 
		List<Integer> numbers = new ArrayList<Integer>(1000000); //List of 1M records
		
		for(int i =0; i<numbers.size(); i++){ 
			numbers.add(new Integer(i)); 
		}


	}
}
