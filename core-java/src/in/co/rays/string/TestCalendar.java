package in.co.rays.string;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	public static void main(String[] args) {
		Date today = new Date();
		Calendar cal = Calendar.getInstance(); // get a calendar for current locale & time zone

		System.out.println("Current locate & time zone: " + cal);

		cal.setTime(today); // Set to the current time

		System.out.println("Time Set in current time: " + cal);

		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR); // Get year of the day

		System.out.println(dayOfYear);

		cal.add(Calendar.DATE, 20); // Get date after 30 days

		Date nextevent = cal.getTime();

		System.out.println("Date After 30 days: " + nextevent);

		cal.add(Calendar.DATE, (-30)); // Get date before 30 days

		Date pastevent = cal.getTime();

		System.out.println("Date before 30 days: " + pastevent);

	}

}
