package in.co.rays.exercise;

import java.util.Scanner;

public class fabonacii {
	public static void main(String[] args) {

		int x = 0;
		int y = 1;

		System.out.println(x);

		for (int i = 0; i < 10; i++) {

			int z = x + y;

			x = y;
			y = z;
			System.out.println(z);

		}

	}

}
