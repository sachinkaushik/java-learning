package concurrency;

import java.util.concurrent.CountDownLatch;

public class MyTask implements Runnable{

	CountDownLatch count;
	
	MyTask(CountDownLatch count){
		this.count = count;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
