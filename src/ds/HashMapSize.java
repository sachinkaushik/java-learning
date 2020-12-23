package ds;
import java.util.*;
public class HashMapSize {
	int id ;
	String name;
	public static void main(String ar[])
	{   
		Employeee e1=new Employeee(100,"PT");
	Employeee e2=new Employeee(101,"PT1");
	Employeee e3=new Employeee(101,"PT1");
	Employeee e4=new Employeee(101,"PT1");
	Employeee e5=new Employeee(101,"PT1");
	Employeee e6=new Employeee(101,"PT1");
	Employeee e7=new Employeee(101,"PT1");
	Employeee e8=new Employeee(101,"PT1");
	Employeee e9=new Employeee(101,"PT1");
	Employeee e10=new Employeee(101,"PT1");
	Employeee e11=new Employeee(101,"PT1");
	Employeee e12=new Employeee(101,"PT1");
	Employeee e13=new Employeee(101,"PT1");
	Employeee e14=new Employeee(101,"PT1");
		Map map=new HashMap();
		map.put(e1,"null");
		map.put(e2,null);
		map.put(e3,"null");
		map.put(e4,null);
		map.put(e5,"null");
		map.put(e6,null);
		map.put(e7,"null");
		map.put(e8,null);
		map.put(e9,"null");
		map.put(e10,null);
		map.put(e11,"null");
		map.put(e12,null);
		map.put(e13,"null");
		map.put(e14,null);
		System.out.println("Size"+ map.size()+"capacity");
		
		if(map.containsKey(e10))
		{
			System.out.println("Key is");
		}
	}
	
	

}



 class Employeee
 {
	 int id;
	 String name;
	 
	 public Employeee(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 public int hashCode()
	 {
		 return 100;
	 }
 }