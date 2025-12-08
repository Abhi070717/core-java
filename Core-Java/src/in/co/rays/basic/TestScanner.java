package in.co.rays.basic;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Integer :");
		int a = sc.nextInt();

		System.out.println("Enter Second Integer :");
		int b = sc.nextInt();

		System.out.println("Our First Integer is : " + a);
		System.out.println("Our First Integer is : " + b);

		System.out.println("Select The One Operator(+, -, *, /, %)");
		String opt = sc.next();
		
		switch (opt) {
		case "+":
			System.out.println("Result :" + (a+b));
			break;
		case "-":
			System.out.println("Result :" + (a-b));
			break;
		case "*":
			System.out.println("Result :" + (a*b));
			break;
		case "/":
			System.out.println("Result :" + (a/b));
			break;
		case "%":
			System.out.println("Result :" + (b%a));
			break;
		}
	}

}
