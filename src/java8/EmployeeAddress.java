package java8;

public class EmployeeAddress {
	private String houseNo;
	private String street;
	private String city;

	// EmployeeAddress constructor
	public EmployeeAddress(String houseNo, String street, String city) {
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
