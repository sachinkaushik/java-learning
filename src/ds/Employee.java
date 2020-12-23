package ds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Employee implements Comparable{

    String name;
    int sal;

    //Other implementations

    
    public Employee(String name,int sal){
    	this.name=name;
    	this.sal=sal;
    }
    public int compareTo(Object o1) {

        Employee e = (Employee)o1;
        int iSalComaprison = Integer.compare(this.sal, e.sal);
        if (iSalComaprison == 0)//Salaries are equal use name as comparison criteria
        {
            //lhs name comparison with rhs name
            return name.compareTo(e.name);
        }
        //Now if salaries are not equal, return comparison of salries
        return iSalComaprison;

    }
    
    
    public static void main(String args[]){
    	List l1=new ArrayList();
    	List l2=new ArrayList();
    	List l3=new ArrayList();
    	List l4=new ArrayList();
    	List l5=new ArrayList();
    	l1.add(new Employee("abc", 2000));
    	l1.add(new Employee("cdb", 1500));
    	l1.add(new Employee("bca", 4000));
    	l1.add(new Employee("ebc", 3000));
    	l1.add(new Employee("dcb", 5000));
    	Collections.sort(l1);
    	System.out.println(l1);
    }
    
    
    

}