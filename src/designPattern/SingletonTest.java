package designPattern;

public class SingletonTest {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonDemo s1 = SingletonDemo.getInstance();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonDemo s1 = SingletonDemo.getInstance();
			}
		});
		
		t1.start();
		t2.start();
	}
}
