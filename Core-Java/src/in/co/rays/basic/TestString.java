package in.co.rays.basic;

public class TestString {
	public static void main(String[] args) {
		String name = "Vijay Dinanath "; 
		String name1 = "Chouhan";
		System.out.println(name + name1);
		System.out.println("String length " + name.length());
		System.out.println(name.charAt(6));
		System.out.println(name.indexOf('v'));
		System.out.println(name.replace("i", "j"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Vijay"));
		System.out.println(name.endsWith("an"));
		System.out.println(name.substring(1));
		System.out.println(name.lastIndexOf("D"));
		System.out.println(name.replace('h', 'y'));
		System.out.println(name);
		System.out.println();

	}
}
