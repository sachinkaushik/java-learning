package ds;import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int salary;
    private int age;
    private Date dateOfJoining;
  
    public static final Comparator<Employee> AgeComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.age - o2.age;  // This will work because age is positive integer
        }
      
    };
  
    public static final Comparator<Employee> SalaryComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.salary - o2.salary; // salary is also positive integer
        }
      
    };
  
    public static final Comparator<Employee> NameComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
      
    };
  
    public static final Comparator<Employee> DOJComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.dateOfJoining.compareTo(o2.dateOfJoining);
        }
      
    };

    public Employee(int id, String name, int salary, int age, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", dateOfJoining=" + dateOfJoining + '}';

    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.dateOfJoining != other.dateOfJoining && (this.dateOfJoining == null || !this.dateOfJoining.equals(other.dateOfJoining))) {

            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 47 * hash + this.salary;
        hash = 47 * hash + this.age;
        hash = 47 * hash + (this.dateOfJoining != null ? this.dateOfJoining.hashCode() : 0);
        return hash;
    }

}




/**
 * Test class to test sorting of Employee object on different parameters.
 * each test method will test each Comparator implementation.
 * @author http://javarevisited.blogpot.com
 */
public class EmployeeTest {
  
 
  
    public void testEmployeeSorting(){
        Employee e1 = new Employee(1, "A", 1000, 32, new Date(2011, 10, 1));
        Employee e2 = new Employee(2, "AB", 1300, 22, new Date(2012, 10, 1));
        Employee e3 = new Employee(3, "B", 10, 42, new Date(2010, 11, 3));
        Employee e4 = new Employee(4, "CD", 100, 23, new Date(2011, 10, 1));
        Employee e5 = new Employee(5, "AAA", 1200, 26, new Date(2011, 10, 1));
      
        List<Employee> listOfEmployees = new ArrayList<Employee>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
        listOfEmployees.add(e5);
        System.out.println("Unsorted List : " + listOfEmployees);
      
        Collections.sort(listOfEmployees);      //Sorting by natural order
        assertEquals(e1, listOfEmployees.get(0));
        assertEquals(e5, listOfEmployees.get(4));
      
        Collections.sort(listOfEmployees, Employee.NameComparator);
        assertEquals(e1, listOfEmployees.get(0));
        assertEquals(e4, listOfEmployees.get(4));
      
        Collections.sort(listOfEmployees, Employee.AgeComparator);
        assertEquals(e2, listOfEmployees.get(0));
        assertEquals(e3, listOfEmployees.get(4));
      
        Collections.sort(listOfEmployees, Employee.SalaryComparator);
        assertEquals(e3, listOfEmployees.get(0));
        assertEquals(e2, listOfEmployees.get(4));
      
        Collections.sort(listOfEmployees, Employee.DOJComparator);
        assertEquals(e3, listOfEmployees.get(0));
        assertEquals(e2, listOfEmployees.get(4));
    }
}


Read more: http://javarevisited.blogspot.com/2014/01/java-comparator-example-for-custom.html#ixzz5AqM8rBA5