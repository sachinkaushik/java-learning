package java8;

import java.io.IOException;

public class MyResource1 implements AutoCloseable{

	@Override
	public void close() throws IOException {
		System.out.println("1");
	}

}
