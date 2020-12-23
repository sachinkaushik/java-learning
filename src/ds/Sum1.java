package ds;
class SumThread extends Thread {
  public SumThread(int from, int to) {
    this.from = from;
    this.to = to;
    sum = 0;
  }

  public void run( ) {
    for(int i = from; i <= to; i++) {
      sum += i;
      System.out.println("from="+from+"to="+to+ "sum="+sum +"Current Thread"+Thread.currentThread());
    } 
  }

  public int getSum( ) {
    return sum;
  }

  private int from, to;
  static int  sum;
}


public class Sum1 {
  public static void main(String args[]) {
	  Integer n= new Integer(10);
	  int v=n;
    SumThread t1 = new SumThread(1, 500);
    SumThread t2 = new SumThread(501, 1000);
    t1.start( );
    t2.start( );

    System.out.printf("The sum of 1-1000 is %d.\n", t1.getSum( ) + t2.getSum( ));
  }
}