package java8demo;

@FunctionalInterface
public interface FunctionalInterDemo {

	void abc();
	
	default public void dm1() {
		System.out.println("default method.1..");
	}
	
	default public void dm2() {
		System.out.println("default method.2..");
	}
	
	static void sm1() {
		System.out.println("static method..1..");
	}
	
	static void sm2() {
		System.out.println("static method..2..");
	}
}
