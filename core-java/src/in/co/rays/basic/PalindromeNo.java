package in.co.rays.basic;

public class PalindromeNo {
	public static void main(String[] args) {
		int num = 222;
		int r = 0;
		int sum = 0;
		int num2 = num;
		while(num2 != 0) {
			r = num2 % 10;
			sum = (sum * 10) + r;
			num2 = num2 / 10;
		}
		System.out.println("Reverse No.:" + sum);
		if(sum==num) {
			System.out.println("Palindrome No");
		}else {
			System.out.println("Not Palindrome No");
		}

	}

}
