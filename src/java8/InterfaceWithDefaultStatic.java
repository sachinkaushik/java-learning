package java8;

public interface InterfaceWithDefaultStatic {

	public static void staticMethod() {
		System.out.println("static method...");
	}
	
	public default void defaultMethod() {
		System.out.println("default method");
	}
}
