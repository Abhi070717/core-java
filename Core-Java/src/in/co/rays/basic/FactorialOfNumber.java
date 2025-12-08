package in.co.rays.basic;

public class FactorialOfNumber  {
	public static void main(String[]args) {
		int factorial = 1;
		int num = 3;
		for(int i = num; i>0; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}
