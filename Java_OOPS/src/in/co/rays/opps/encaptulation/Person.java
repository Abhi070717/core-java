package in.co.rays.opps.encaptulation;

import java.util.Date;

public class Person {

	private String name;
	private Date DOB;
	private String address;
	public static final int AVG_AGE = 18;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDOB() {
		return this.DOB;
	}

	public void setDOB(Date DOB) {
		this.DOB = DOB;

	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge(Date DOB) {
		Date now = new Date();

		@SuppressWarnings("deprecation")
		int Age = now.getYear() - DOB.getYear();

		return Age;

	}
}
