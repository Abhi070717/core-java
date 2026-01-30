package in.co.rays.string;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		System.out.println("Todays Date: " + today);
		System.out.println(" ");

		LocalDate BirthDay = LocalDate.of(2002, 07, 17);

		System.out.println("BirthDay: " + BirthDay);
		System.out.println("--------------------------");

		Period p = Period.between(BirthDay, today);

		System.out.println(("Age: " + p));
		System.out.println(" ");

		System.out.println("Abhi's Age: " + p.getYears());
		System.out.println(" ");
		System.out.println("Month: " + p.getMonths());
		System.out.println(" ");
		System.out.println("Day: " + p.getDays());

	}

}