package java8demo;

public class DefaultMethodTest implements FunctionalInterDemo, FunctionalInterDemo2{

	public static void main(String[] args) {
		FunctionalInterDemo obj1 = () -> {System.out.println("abc.........");};

	}

	@Override
	public void mno() {
		System.out.println("mno");
		
	}

	@Override
	public void abc() {
		System.out.println("abc");
		
	}

	@Override
	public void dm1() {
		// TODO Auto-generated method stub
		//FunctionalInterDemo.super.dm1();
		
		System.out.println("own implementation of dm1...");
	}

}
