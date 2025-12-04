package in.co.rays.basic;

public class FactorialOfNumber  {
	public static void main(String[]args) {
		int fact = 1;
		int num = 3;
		for(int i = num; i>0; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
