package designPattern;

public class EnumTest {

	public static void main(String[] args) {
		EnumSingleton e1 = EnumSingleton.INSTANCE;
		e1.i = 5;
		e1.show();
		EnumSingleton e2 = EnumSingleton.INSTANCE;
		e2.i = 6;
		
		e1.show();
	}
}
