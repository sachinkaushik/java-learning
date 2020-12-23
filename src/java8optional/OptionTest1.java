package java8optional;

import java.util.Optional;

public class OptionTest1 {

	public static void main(String[] args) {

		//method 1 - case 1
		Optional<String> optnl = Optional.of("Sachin");
		
		if(optnl.isPresent())
			System.out.println(optnl.get());
		
		optnl.ifPresent(System.out::println);
		
		System.out.println("---"+optnl.filter(s -> s.equals("SACHIN")));
		
		
		//method 1 - case 2
		System.out.println(Optional.of(null));
		//here NullPointerException will be thrown at run time
		// because for Optional.of(T t) , t must be non null type, else NPE will be thrown at run time
		
		//method 2
		Optional<String> optnl1 = Optional.empty();
		if(optnl1.isPresent())
			System.out.println(optnl1.get());
		else
			System.out.println(optnl1);
		
		
		//method 3
		Optional<String> opp = Optional.ofNullable(null);
		
		if(opp.isPresent()) {
			System.out.println(opp.get());
		}
	}

}
