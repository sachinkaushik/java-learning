package java8;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class MyResourceTest {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		nums.stream().filter( p -> p%2 == 0).forEach(s -> System.out.print(s));
		
		
		
		Queue<String> products = new ArrayDeque<String>();
		 products.add("p1");
		 products.add("p2");
		 products.add("p3");
		 System.out.print(products.peek());
		 System.out.print(products.poll());
		 System.out.println("");
		 products.forEach(s -> System.out.print(s));
		
		try(MyResource2 r2 = new MyResource2(); MyResource1 r1 = new MyResource1();){
			System.out.println("try");
		}catch(IOException e) {
			System.out.println("IO");
		}finally {
			System.out.println("finally");
		}
	}

}
