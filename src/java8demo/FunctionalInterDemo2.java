package java8demo;

@FunctionalInterface
public interface FunctionalInterDemo2 {

	void mno();
	
	default public void dm1() {
		System.out.println("default method 1");
	}
}
