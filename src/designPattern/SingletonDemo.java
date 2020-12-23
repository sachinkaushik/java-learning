package designPattern;

public class SingletonDemo {

	//public static SingletonDemo obj = new SingletonDemo(); //Eager 
	
	public static SingletonDemo obj = null;
	
	private SingletonDemo() {
		System.out.println("object created..");
	}
	
	public static SingletonDemo getInstance() { // double check locking
		if(obj == null)
		{
			synchronized (SingletonDemo.class) {
				if(obj == null) {
					obj = new SingletonDemo();
				}
			}
		}
			
		
		return obj;
	}
}
