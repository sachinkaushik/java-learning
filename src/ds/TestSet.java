package ds;
import java.util.*;
public class TestSet {
	public static void main(String ar[])
	{
	Set set = new HashSet <Employee>();
	Employee e1= new Employee(100, "prashant");
	Employee e2= new Employee(200, "Amit");
	Employee e3= new Employee(100, "prashant");
	set.add(e1);
	set.add(e2);
	set.add(e3);
	System.out.println("Set="+set);
	}
	
}


class Employee
{
	int id;
	String name;
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
		public int hashCode()
	{
		return id;
	}
	
	 public boolean equals(Object obj){
	        System.out.println("In equals");
	        if (obj instanceof Employee) {
	        	Employee pp = (Employee) obj;
	            return (pp.name.equals(this.name) && pp.id == this.id);
	        } else {
	            return false;
	        }
	    }
	
	
	
}