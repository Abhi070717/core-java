package in.co.rays.string;

public class TestHeapAndLiteralPool {
	public static void main(String[] args) {
		String s1 = "SUNRAYS";
		String s2 = "SUNRAYS";
		String s3 = new String("Hello World");
		String s4 = new String("Hello World");

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}

}
