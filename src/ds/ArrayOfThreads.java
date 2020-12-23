package ds;
class Test extends Thread
{
  static int sum;
  public void run()
  {
    for(int i = 0; i < 10; i++)
    {
      sum += i;
   //   System.out.println("Sum = " + sum);
    }		
  }
}
public class ArrayOfThreads
{
  public static void main(String args[])
  {
    Test test[] = new Test[5];  
     for(int i = 0; i < test.length; i++)
     {
       test[i] = new Test();
       test[i].start();
     }
     System.out.println("Sum:: = " + Test.sum);
  }
}
