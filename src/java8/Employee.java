package java8;

public class Employee implements Cloneable {

	private Integer id;
	private String name;
	private String lastName;
	private Integer age;
	private EmployeeAddress empAddress;

	public Employee(String name, Integer age, EmployeeAddress empAddress) {
		this.name = name;
		this.age = age;
		this.empAddress = empAddress;
	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(Integer id, String name, String lastName, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public EmployeeAddress getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(EmployeeAddress empAddress) {
		this.empAddress = empAddress;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee cln = (Employee)super.clone();
		EmployeeAddress clnAddrss = new EmployeeAddress(this.getEmpAddress().getHouseNo(), this.getEmpAddress().getStreet(), this.getEmpAddress().getCity());
		cln.setEmpAddress(clnAddrss);
		return cln;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
