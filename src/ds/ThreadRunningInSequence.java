package ds;
public class ThreadRunningInSequence {
 
    public static void main(String[] args) {
 
        ResourceLock lock = new ResourceLock();
 
        ThreadA a=new ThreadA(lock);
        ThreadB b=new ThreadB(lock);
        ThreadC c=new ThreadC(lock);
 
        a.start();
        b.start();
        c.start();
    }
}

 class ThreadA extends Thread{
	 
    ResourceLock lock;
 
    ThreadA(ResourceLock lock){
        this.lock = lock;
    }
 
    @Override
    public void run() {
 
        try{
            synchronized (lock) {
 
                for (int i = 0; i < 100; i++) {
 
                    if(lock.flag!=1){
                        lock.wait();
                    }
 
                    System.out.print("A ");
                    Thread.sleep(1000);
                    lock.flag = 2;
                    lock.notifyAll();
                }
 
            }
        }catch (Exception e) {
            System.out.println("Exception 1 :"+e.getMessage());
        }
 
    }
 
}
 class ThreadB extends Thread{
	 
    ResourceLock lock;
 
    ThreadB(ResourceLock lock){
        this.lock = lock;
    }
 
    @Override
    public void run() {
 
        try{
            synchronized (lock) {
 
                for (int i = 0; i < 100; i++) {
 
                    if(lock.flag!=2){
                        lock.wait();
                    }
 
                    System.out.print("B ");
                    Thread.sleep(1000);
                    lock.flag = 3;
                    lock.notifyAll();
                }
 
            }
        }catch (Exception e) {
            System.out.println("Exception 2 :"+e.getMessage());
        }
 
    }
}

 class ThreadC extends Thread{
	 
    ResourceLock lock;
 
    ThreadC(ResourceLock lock){
        this.lock = lock;
    }
 
    @Override
    public void run() {
 
        try{
            synchronized (lock) {
 
                for (int i = 0; i < 100; i++) {
 
                    if(lock.flag!=3){
                        lock.wait();
                    }
 
                    System.out.print("C ");
                    Thread.sleep(1000);
                    lock.flag = 1;
                    lock.notifyAll();
                }
 
            }
        }catch (Exception e) {
            System.out.println("Exception 3 :"+e.getMessage());
        }
 
    }
}

 class ResourceLock{
    public volatile int flag = 1;
}
