package java8;

import java.io.IOException;

public class MyResource2 implements AutoCloseable{

	@Override
	public void close() throws IOException {
		System.out.println("2");
		throw new IOException();
	}

}
