package concurrency;

import java.util.concurrent.CountDownLatch;

public class TaskAssignmentCountDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch c = new CountDownLatch(2);
		
		DevTeam t1 = new DevTeam(c);
		DevTeam t2 = new DevTeam(c);
		new Thread(t1).start();
		new Thread(t2).start();
		
		c.await();
		
		DevTeam tt1 = new DevTeam(c);
		DevTeam tt2 = new DevTeam(c);
		new Thread(tt1).start();
		new Thread(tt2).start();
		c.await();
		QATeam q = new QATeam();
		new Thread(q).start();
	}

}
