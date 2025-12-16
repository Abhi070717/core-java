package in.co.rays.opps.inheritance;

import java.util.Date;

public class Person {
	protected String name;
	protected String address;
	protected Date DateOfBirth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;

	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}

}
