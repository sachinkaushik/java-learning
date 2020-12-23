package ds;
import java.util.LinkedList;
import java.util.Queue;
 class TestThreadPool {
    public static void main(String[] args) throws InterruptedException {
    	//create queue size - 3
    	//Number of threads - 4
        ThreadPool threadPool = new ThreadPool(3,4);
        //Created 15 Tasks and submit to pool
        for(int taskNumber = 1 ; taskNumber <= 7; taskNumber++) {
            TestTask task = new TestTask(taskNumber);
            threadPool.submitTask(task);
        }
    }
}

  class ThreadPool {
		
	    BlockingQueue <Runnable> queue;
	    public ThreadPool(int queueSize, int nThread) {
	        queue = new BlockingQueue<Runnable>(queueSize);
	        String threadName = null;
	        TaskExecutor task = null;
	        for (int count = 0; count < nThread; count++) {
	        	threadName = "Thread-"+count;
	        	task = new TaskExecutor(queue);
	            Thread thread = new Thread(task, threadName);
	            thread.start();
	        }
	    }

	    public void submitTask(Runnable task) throws InterruptedException {
	        queue.enqueue(task);
	    }
	}
 
 class TestTask implements Runnable {
    private int number;
    public TestTask(int number) {
        this.number = number;
    }
  // @Override
    public void run() {
        System.out.println("Start executing of task number :"+ number);
        try {
            //Simulating processing time
        	//perform tasks
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End executing of task number :"+ number);
    }
}

 class BlockingQueue<Type>  {
    private Queue<Type> queue = new LinkedList<Type>();
    private int EMPTY = 0;
    private int MAX_TASK_IN_QUEUE = -1;

    public BlockingQueue(int size){
        this.MAX_TASK_IN_QUEUE = size;
    }

    public synchronized void enqueue(Type task)
            throws InterruptedException  {
        while(this.queue.size() == this.MAX_TASK_IN_QUEUE) {
            wait();
        }
        if(this.queue.size() == EMPTY) {
            notifyAll();
        }
        this.queue.offer(task);
    }

    public synchronized Type dequeue()
            throws InterruptedException{
        while(this.queue.size() == EMPTY){
            wait();
        }
        if(this.queue.size() == this.MAX_TASK_IN_QUEUE){
            notifyAll();
        }
        return this.queue.poll();
    }
}

 class TaskExecutor implements Runnable {
    BlockingQueue<Runnable> queue;
    
    public TaskExecutor(BlockingQueue<Runnable> queue) {
        this.queue = queue;
    }

 //   @Override
    public void run() {
        try {
            while (true) {
                String name = Thread.currentThread().getName();
                Runnable task = queue.dequeue();
                System.out.println("Task Started by Thread :" + name);
                task.run();
                System.out.println("Task Finished by Thread :" + name);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
