package in.co.rays.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormating {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		System.out.println("Date : " + date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // EEEEEEE MMMMMMMM dd yyyy h:mm:ss a z

		String formatedDate = sdf.format(date); // Convert date format to String format

		System.out.println("Formated Date : " + formatedDate);

		System.out.println("-----------------------------------");

		String date1 = "2002-07-17"; // yyyy-MM-dd
		System.out.println("formatedDate: " + date1);

		Date DoB = sdf.parse(date1); // Convert from String
		System.out.println("Date of DoB: " + DoB);

	}

}
