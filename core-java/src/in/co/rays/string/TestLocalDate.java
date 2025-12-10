package in.co.rays.string;

import java.time.LocalDate;

public class TestLocalDate {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now(); // Current LocalDate Todays
		
		System.out.println("Todays Date: " + now);
		System.out.println("Todayss Day: " + now.getDayOfWeek());
		System.out.println("Day of Month: " + now.getDayOfMonth());
		System.out.println("Day of year: "+ now.getDayOfYear());
		System.out.println("year: "+ now.getYear());
		System.out.println("month: "+ now.getMonth());
		
		System.out.println("----------------------------------");
		
		LocalDate DoB = LocalDate.of(2002, 07, 17); //DoB of 2002-07-17
		
		System.out.println("DoB of Day: " + DoB) ;
		System.out.println("DoB of Week: " + DoB.getDayOfWeek());
		System.out.println("DoB of Month: " + DoB.getDayOfMonth());
		System.out.println("DoB of Year: "+ DoB.getDayOfYear());
		System.out.println("Year: " + DoB.getYear());
		System.out.println("Month: "+DoB.getMonth());
		
	}

}
