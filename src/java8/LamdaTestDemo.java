package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LamdaTestDemo {

	static int count = 0;
	
	public static void main(String[] args) {
		/*
		 * if(count < 3) { count++; main(null); }else { return; }
		 * System.out.println("hhhhhhhhhhhhhh");
		 * 
		 * List<String> names = Arrays.asList("b", "a", "c");
		 * 
		 * Collections.sort(names);
		 * 
		 * System.out.println(names);
		 */
		Calculate c = (int n) -> {return n*n;};
		
		//Calculate c1 = (int n) -> return n*n; invalid
		
		Calculate c2 = (n) -> n*n;
		
		Calculate c3 = n -> n*n;
		
		//Calculate c4 = n -> {n*n;}; invalid
		
		for(int i=0; i< 10;i++) { 
			i+=1;
			System.out.println("a");
		}
	}

}


interface Calculate{
	int square(int n);
}