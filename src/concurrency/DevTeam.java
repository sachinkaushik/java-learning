package concurrency;

import java.util.concurrent.CountDownLatch;

public class DevTeam implements Runnable{

	CountDownLatch count;
	
	DevTeam(CountDownLatch count){
		this.count = count;
	}
	
	@Override
	public void run() {
		System.out.println("Task assigned to dev team " +Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Task finished by dev team " +Thread.currentThread().getName());
		//each thread will call countDown() method on task compeletion
		count.countDown();
		System.out.println("Task finished by dev team " +Thread.currentThread().getName() +" count "+count.getCount());
	}

}
