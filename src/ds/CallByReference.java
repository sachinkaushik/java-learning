package ds;
class Number {
   String x;
}

class CallByReference {

   public static void main ( String[] args ) {
	   System.out.print(main(12));
      Number a = new Number();
      a.x="abc";
      System.out.println("Value of a.x before calling increment() is "+a.x);
      increment(a);
      System.out.println("Value of a.x after calling increment() is "+a.x);
   }

   public static void increment(Number n) {
      System.out.println("Value of n.x before incrementing x is "+n.x);
      n.x=n.x+"cd";
      System.out.println("Value of n.x after incrementing x is "+n.x);
   }
   public static int main( int args ) {
	   return 100;
   }
  
} 