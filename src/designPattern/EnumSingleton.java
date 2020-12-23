package designPattern;

public enum EnumSingleton {

	INSTANCE;
	int i;
	
	public void show() {
		System.out.println(i);
	}
}
