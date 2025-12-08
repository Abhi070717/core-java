package in.co.rays.basic;

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Abhishish Bhawsar food cart ");
		sb.append("Java");

		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		System.out.println(sb.indexOf("h"));
		System.out.println(sb.lastIndexOf("s"));
		System.out.println(sb.replace(0, 9, "Abhishish"));
		System.out.println(sb.reverse());

		System.out.println(sb);
	}

}
