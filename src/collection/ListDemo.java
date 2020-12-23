package collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ListDemo {

	private static String pattern = "yyyy-MM-dd";
	static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
	public static void main(String[] args) throws ParseException {
		
		
		String s = "0.0";
		String s1= "0.0";
		
		System.out.println(s1.equals(s));
		
		Date bDate = new SimpleDateFormat("MM-dd-yyyy").parse("01-01-2007");
		Calendar c = Calendar.getInstance();
		c.setTime(bDate);
		c.add(Calendar.DATE, -1);
		String newDate = simpleDateFormat.format(c.getTime());
		System.out.println(newDate);
		
		
		List<Employee> emps = new ArrayList<>();
		add(new Employee(1, "a"), emps);
		add(new Employee(2, "b"), emps);
		add(new Employee(3, "c"), emps);
		add(new Employee(4, "d"), emps);
		add(new Employee(4, "d"), emps);
		add(new Employee(3, "c"), emps);
		
		emps.forEach(System.out::println);
		
	}
	
	public static void add(Employee e, List<Employee> emps) {
		if(!emps.contains(e)) {
			emps.add(e);
		}
	}
}
