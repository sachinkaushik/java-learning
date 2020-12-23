package concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RunnableTask implements Runnable {

	CyclicBarrier cb;
	long sleepMS;

	RunnableTask(CyclicBarrier cb, long sleepMS) {
		this.cb = cb;
		this.sleepMS = sleepMS;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(sleepMS);
			System.out.println(Thread.currentThread().getName() + " is waiting for "
					+ (cb.getParties() - cb.getNumberWaiting() - 1) + " other threads to reach common barrier point");
			cb.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("As " + cb.getParties() + " threads have reached common barrier point "
				+ Thread.currentThread().getName() + " has been released");
	}

}
