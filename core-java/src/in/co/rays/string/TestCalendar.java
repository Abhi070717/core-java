package in.co.rays.string;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	public static void main(String[] args) {
		Date today = new Date();
		Calendar cal = Calendar.getInstance(); // get a calendar for current locale & time zone
		cal.setTime(today);

		System.out.println("Todays Date: " + today);
		System.out.println("Calendar Instance: " + cal);
		System.out.println("Current time Set: " + today);
	}
}
