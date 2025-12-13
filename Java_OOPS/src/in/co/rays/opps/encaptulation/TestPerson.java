package in.co.rays.opps.encaptulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Person R1 = new Person();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		R1.setName("Ram Joshi");
		R1.setDOB(sdf.parse("2002-07-17"));
		R1.setAddress("Kukshi");

		System.out.println("Customer Name: " + R1.getName());
		System.out.println("Customer DOB: " + R1.getDOB());
		System.out.println("Customer Address: " + R1.getAddress());
		System.out.println("Customer Age: " + R1.getAge(R1.getDOB()));
		
		System.out.println("-------------------------------");
		
		Person S1 = new Person();
		
		S1.setName("Shayam gupta");
		S1.setDOB(sdf.parse("2009-08-27"));
		S1.setAddress("Manawar");
		
		System.out.println("Customer Name: " + S1.getName());
		System.out.println("Customer DOB: " + S1.getDOB());
		System.out.println("Customer Address: " + S1.getAddress());
		System.out.println("Customer Age: " + S1.getAge(S1.getDOB()));
		
		
	}

}