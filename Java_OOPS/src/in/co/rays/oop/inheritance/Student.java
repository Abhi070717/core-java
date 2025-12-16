package in.co.rays.opps.inheritance;

public class Student extends Person {
	private String rollNo;
	private int marks;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
		if (marks >= 23 && marks <= 100) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}

}
