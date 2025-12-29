package in.co.rays.practice;

public class prime {

	public static void main(String[] args) {

		int i = 7;

		int count = 0;

		for (int a = 2; a < i; a++) {

			if (i % a == 0) {
				count++;
			}

			if (count > 0) {
				System.out.println(i + "is Prime");
			} else {
				System.out.println(i + "is not prime");
			}
		}

	}

}