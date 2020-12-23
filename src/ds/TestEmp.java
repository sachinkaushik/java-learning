package ds;
import java.util.HashSet;
import java.util.Set;




 class Emp 
{
	private int age ;
	private int hashcode=10;
	public Emp( int age )
	{
		super();
		this.age = age;
	}
	
/*	public int hashCode()
	{
		int a=hashcode;
		a++;
		return a;
	}
*/	
/*	public boolean equals( Object obj )
	{
		boolean flag = false;
		Emp emp = ( Emp )obj;
		if( emp.age == age )
			flag = true;
		return flag;
	}*/
	
	public String toString(){
		return "hello";
	}
}



public class TestEmp {
	public static void main(String[] args) 
	{	Set set=new HashSet();
		Integer a1=new Integer(10);
		Integer b1=new Integer(10);
		Emp emp1 = new Emp(23);
		Emp emp2 = new Emp(23);
		Emp emp3 = new Emp(23);
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		System.out.println("HashSet Size--->>>"+set.size());
		System.out.println("hs.contains( new Emp(25))--->>>"+set.contains(new Emp(25)));
		System.out.println("hs.remove( new Emp(24)--->>>"+set.remove( new Emp(24)));
		System.out.println("Now HashSet Size--->>>"+set.size());
		
		
		
		
		
		
	//	System.out.println("emp1.equals(emp2)--->>>"+emp1.equals(emp2));
	//	System.out.println(set);
		
		String[] thisIsAStringArray = {"geeks","geeksforgeeks",  "geeking", "geezer"};
		String str=longestCommonPrefix(thisIsAStringArray);
	//	System.out.println("Longest Prefix:"+str);
	//	System.out.println(add(5,7));
		
	}

	
	public static String longestCommonPrefix(String[] strs) {
	    if(strs==null || strs.length==0){
	        return "";
	    }
	 
	    if(strs.length==1) 
	        return strs[0];
	 
	    int minLen = strs.length;
	 
	    for(String str: strs){
	        if(minLen > str.length()){
	            minLen = str.length();
	        }
	    }
	 
	    for(int i=0; i<minLen; i++){
	        for(int j=0; j<strs.length-1; j++){
	            String s1 = strs[j];
	            String s2 = strs[j+1];
	            if(s1.charAt(i)!=s2.charAt(i)){
	                return s1.substring(0, i);
	            }
	        }
	    }
	 
	    return strs[0].substring(0, minLen);
	}
	
	public static <T extends Number> T add (T one, T two)
	{
		if (one.getClass() == Integer.class) {
	        // With auto-boxing / unboxing
	        return (T) (Integer) ((Integer) one + (Integer) two);
	}
	 return one;
	}
	

}
