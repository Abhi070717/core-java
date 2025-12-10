package in.co.rays.basic;

public class TestCalculator {
	public static void main(String[] args) {
		String opt = "%";
		int a = 10;
		int b = 5;
		switch (opt) {
		case "+":
			System.out.println("result " + (a + b));
			break;
		case "-":
			System.out.println("Result " + (a - b));
			break;
		case "*":
			System.out.println("Result " + (a * b));
			break;
		case "/":
			System.out.println("Result " + (a / b));
			break;
		case "%":
			System.out.println("Result " + (b % a));
		}

	}

}
