package concurrency;

public class QATeam implements Runnable{

	
	QATeam(){
	}
	
	@Override
	public void run() {
		System.out.println("Task assigned to QA team " +Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Task finished by QA team " +Thread.currentThread().getName());
		//each thread will call countDown() method on task compeletion
	}

}
