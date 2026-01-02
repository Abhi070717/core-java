package in.co.rays.collectionSorting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeUsingComprable implements Comparable<EmployeeUsingComprable> {

	private String empName;
	private int empId;
	private Date empJoinDate;
	private int salary;
	private String companyName;

	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	public EmployeeUsingComprable(String empName, int empId, String empJoinDate, int salary, String companyName)
			throws ParseException {

		this.empName = empName;
		this.empId = empId;
		this.empJoinDate = sdf.parse(empJoinDate);
		this.salary = salary;
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee Name: " + empName + " | Employee Id: " + empId + " | Employee Joining Date: "
				+ sdf.format(empJoinDate) + " | Salary of the Employee: " + salary + " | Name of company: "
				+ companyName + "\n";
	}

	@Override
	public int compareTo(EmployeeUsingComprable o) {
		return this.empJoinDate.getDate() - o.empJoinDate.getDate();

	}

}
