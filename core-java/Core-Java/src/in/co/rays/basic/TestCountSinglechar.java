package in.co.rays.basic;

public class TestCountSinglechar {
	public static void main(String[] args) {
		String str = "abhishish bhawsar";
		int count = 0;
		for (int j = 0; j < str.length(); j++) {

			if ('i' == str.charAt(j)) {
				count++;
				System.out.println(str.charAt(10));

			}
		}
		System.out.println("-----------");

		if (count > 0) {
			System.out.println("Count Value : " + count);

		}

	}

}
