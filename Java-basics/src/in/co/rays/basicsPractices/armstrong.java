package in.co.rays.basicsPractices;

public class armstrong {

	public static void main(String[] args) {

		int a = 153;
		int temp = a;
		int r = 0;
		int arm = 0;

		while (temp > 0) {

			r = temp % 10;
			arm = arm + r * r * r;
			temp = temp / 10;
		}

		if (a == arm) {
			System.out.println(a + " is armstrong");
		} else
			System.out.println(a + " is not armstrong");

	}

}
