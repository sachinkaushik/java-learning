package java8;

public class CloningInJava {

	public static void main(String args[]) {
		EmployeeAddress empAddress = new EmployeeAddress("22", "Avenue Street", "Dallas");
		Employee emp = new Employee("David", 32, empAddress);
		Employee empClone = null;
		try {
			empClone = (Employee) emp.clone();
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}

		empClone.setAge(99);
		System.out.println("Cloned Employee Object: " + empClone);

		if (empClone.getEmpAddress() == emp.getEmpAddress()) {
			System.out.println("empClone's empAddress reference equals emp's empAddress reference.");
		}
	}
}
