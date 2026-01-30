package in.co.rays.exercise;

import java.util.Random;

public class Randomnumber {
	public static void main(String[] args) {
		Random r = new Random();

		for (int i = 0; i <= 5; i++) {

			int rNumber = r.nextInt(100) + 1;
			System.out.println(rNumber);
		}
	}

}
