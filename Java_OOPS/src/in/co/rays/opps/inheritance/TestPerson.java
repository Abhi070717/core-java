package in.co.rays.opps.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson extends Person {
	public static void main(String[] args) throws ParseException {
		System.out.println("[Stundent]");
		Student s1 = new Student();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		s1.setName("Vishnu Raj");
		s1.setDateOfBirth(sdf.parse("2002-03-02"));
		s1.setAddress("Rau");
		s1.setRollNo("1219538");

		System.out.println("Student's Name: " + s1.getName());
		System.out.println("Student's Roll No.: " + s1.getRollNo());
		System.out.println("Date of birth of student: " + sdf.format(s1.getDateOfBirth()));
		System.out.println("Student's Address: " + s1.getAddress());
		s1.setMarks(55);
		System.out.println("total marks: " + s1.getMarks());
		
		System.out.println("--------------------------------------");
		System.out.println("[Businessman]");
		Businessman b1 = new Businessman();
		
		b1.setName("Mahesh Rao");
		b1.setAddress("Indore");
		b1.setIncome(100000.00);
		
		System.out.println("Businessman's Name: " + b1.getName());
		System.out.println("Businessman's Address: " + b1.getAddress());
		
		System.out.println("Businessman's yearly salary: " + b1.getIncome());
		b1.getIncome();
		
		System.out.println("------------------------------------------");
		System.out.println("[Doctor]");
		
		Doctor d1 = new Doctor();
		
		d1.setName("Dr.Shayam Jain");
		d1.setAddress("154.Scheme 78 Vijay Nagar");
		d1.setRegistrationNo(" 133832/ShJa/254/2022");
		
		System.out.println("Doctor's Name: " + d1.getName());
		System.out.println("Doctor's Address: " + d1.getAddress());
		System.out.println("Doctor's Reg No.: " + d1.getRegistrationNo());
	}

}
