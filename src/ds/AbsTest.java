package ds;

abstract class ABST
{
	/*public ABST(){
		System.out.println("Abstract");
	}
	
	int a,b;
	public ABST(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(" Abstract" +a);
	}*/
	public void meth()
	{
		System.out.println(" meth");
	}
}




public class AbsTest extends ABST {
	int c,d;
/*	public AbsTest(int c,int d)
	{	//super(c,d);
		this.c=c;
		this.d=d;
		
		System.out.println("Non Abstract");
	}
	*/
	public static void main(String ar[])
	{
		AbsTest abs = new AbsTest();
		abs.meth();
		
	}
}
