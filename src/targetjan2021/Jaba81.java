package targetjan2021;

import java.util.Arrays;
import java.util.List;

public class Jaba81 {

	public static void main(String[] args) {

		List<Integer> ll = Arrays.asList(1,2,3,4,5);
		
		ll.stream().map(Jaba81:: check).forEach( i -> System.out.print(i));
	}
	
	private static int check(int i) {
			return i/0;
	}

}
