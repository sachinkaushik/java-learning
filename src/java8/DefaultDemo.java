package java8;

public class DefaultDemo extends C implements A, B{
	
	public void print() {
		System.out.println("Default Demo");
		A.super.print();
	}
	
	public static void main(String[] args) {
		DefaultDemo d = new DefaultDemo();
		d.print();
	}
	

}
