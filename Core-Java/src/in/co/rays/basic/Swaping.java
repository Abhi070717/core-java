package in.co.rays.basic;

public class Swaping {
	public static void main(String[] args) {
		int a = 7;
		int b = 9;
		int c = 0;

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.out.println("----------------");
		// After Swaping
		c = a; // c = 7
		a = b; // a = 9
		b = c; // b = 7
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
