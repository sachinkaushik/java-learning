package demo;

public class Test2 {

	static String str;
	public void Test2() {
		System.out.println("a");
		str = "b";
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println(str);
	}

}
