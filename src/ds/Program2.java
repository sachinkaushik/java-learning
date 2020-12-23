package ds;
import java.util.HashMap;
import java.util.*;
 
class Employee {
    
    private String name;
    
    public Employee(String name) { // constructor
           this.name = name;
    }
    
    //no hashCode() method
    
    @Override
    public boolean equals(Object obj){    
           Employee emp=(Employee)obj;
           return (emp.name==this.name || emp.name.equals(this.name));       
    }
 
    @Override
    public String toString() {
           return "Employee[ name=" + name + "] ";
    }
 
}
 
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class Program2 {
    public static void main(String...a){
           
    	Set<String> set1 = new HashSet<String>();
    	Set<String> set2 = new TreeSet<String>();
    	set1.add("Hello");
    	set2.add("Hello");
    	System.out.println(set1.equals(set2));
    	System.out.println(set2.equals(set1));
    	HashMap<Employee, String> hm=new HashMap<Employee, String>();
           hm.put(new Employee("a"), "emp1");
           hm.put(new Employee("b"), "emp2");
           hm.put(new Employee("a"), "emp1 OVERRIDDEN");
           
           System.out.println("HashMap's data> "+hm);
           System.out.println("HashMap's size> "+hm.size());
           System.out.println(hm.get(new Employee("a")));
           
    }
}
 