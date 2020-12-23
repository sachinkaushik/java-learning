package concurrency;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3, new CyclicBarrierFinishEvent());
		
		RunnableTask r1 = new RunnableTask(cb, 1000);
		RunnableTask r2 = new RunnableTask(cb, 2000);
		RunnableTask r3 = new RunnableTask(cb, 3000);
		
		new Thread(r1, "Thread-1").start();
		new Thread(r2, "Thread-2").start();
		new Thread(r3, "Thread-3").start();
		
		RunnableTask rr1 = new RunnableTask(cb, 1000);
		RunnableTask rr2 = new RunnableTask(cb, 2000);
		RunnableTask rr3 = new RunnableTask(cb, 3000);
		
		new Thread(rr1, "Thread-1").start();
		new Thread(rr2, "Thread-2").start();
		new Thread(rr3, "Thread-3").start();
	}
}
