package in.co.rays.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormating {
	public static void main(String[] args) {
		Date date = new Date(0);
		System.out.println("Date : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd yyyy h:mm:ss a z ");
		String formatedDate = sdf.format(date);
		
		System.out.println("Formated Date : " + formatedDate);

	}

}
