package in.co.rays.string;

import java.util.Date;

public class Testdate {
	public static void main(String[] args) throws InterruptedException {
		Date date = new Date();
		System.out.println("date : " + date);

		while (true) {
			Date d = new Date();
			Thread.sleep(1000); // 1 second;
			System.out.println("Date : " + d);
		}

	}

}
