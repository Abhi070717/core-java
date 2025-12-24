package in.co.rays.string;

public class CountDigitString {
	public static void main(String[] args) {
		String str = "golo453hccjf759dg9fss";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
				System.out.println(i + " = " + count);
			}

		}
		System.out.println("Total digit : " + count);

	}
}