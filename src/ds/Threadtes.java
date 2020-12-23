package ds;
public class Threadtes {


	     static class MyRunnable implements Runnable {

	        private ThreadLocal<Integer> threadLocal =
	               new ThreadLocal<Integer>();
	       
	    	 int i=0;
	    	 
	        @Override
	        public  void run() {
	        	
          for(int j=0;j<10;j++){
        	  //threadLocal.set(j);
        	  threadLocal.set(i);
	           try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	            }
	    
	            System.out.println(Thread.currentThread().getName()+":"+threadLocal.get());
	       //     System.out.println(Thread.currentThread().getName()+":"+i);
	            i++;
          } 
         }
	    }


	    public static void main(String[] args) throws InterruptedException {
	        MyRunnable sharedRunnableInstance = new MyRunnable();

	        Thread thread1 = new Thread(sharedRunnableInstance);
	        Thread thread2 = new Thread(sharedRunnableInstance);

	        thread1.start();
	        thread2.start();

	        thread1.join(); //wait for thread 1 to terminate
	        thread2.join(); //wait for thread 2 to terminate
	    }

	
}
