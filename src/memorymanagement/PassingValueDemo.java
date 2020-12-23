package memorymanagement;

public class PassingValueDemo {

	public static void main(String[] args) {

		int localValue = 5;
		calculate(localValue);
		System.out.println(localValue);
	}
	public static void calculate(int val) {
		val = val *10;
		
		Runnable r = () ->{
			try {
				System.out.println("sleeping for 10 sec");
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		new Thread(r).start();
		
	}

}
