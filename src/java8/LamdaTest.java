package java8;

public class LamdaTest {

	int i=10;
	
	public void main() {
	
		int j = 20;
		
		FunctionalI f = () -> {System.out.println("aabc");};
		f.b();
		
		/*
		 * FunctionalI f = (x) -> { i=90; //j=8989; System.out.println(i);
		 * System.out.println(j); System.out.println(x); }; f.a(100);
		 */
	}
	public static void main(String[] args) {
		LamdaTest t= new LamdaTest();
		t.main();
	}
}
