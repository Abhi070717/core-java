package in.co.rays.opps.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException{
		Person p1 = new Person();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		
		p1.setName("Vishnu");
		p1.setDateOfBirth(sdf.parse("14.04.2005"));
		p1.setAddress("Rau");
		
		System.out.println("Name of student: " + p1.getName());
		System.out.println("Date of birth of student: " + p1.getDateOfBirth());
		System.out.println("Address of the student: "+ p1.getAddress());
	}

}
