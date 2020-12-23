package java8optional;

import java.util.Optional;

public class OptionalTest2 {

	public static void main(String[] args) {

		//map method
		Optional<String> op = Optional.of("java");
		
		Optional<String> ops = op.map(String::toUpperCase);
		System.out.println(ops.get());
		
		//flatMap method
		Optional<Optional<String>> optionalOfOptional = Optional.of(Optional.of("String"));
		
		Optional<String> ds = optionalOfOptional.flatMap(s -> s.map(String::toUpperCase));
		
		System.out.println(ds.get());
	}

}
