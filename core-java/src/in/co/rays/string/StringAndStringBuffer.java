package in.co.rays.string;

public class StringAndStringBuffer {
	public static void main(String[] args) {
		String s = "SUNRAYS";
		System.out.println(s);
		System.out.println(s.replace('S', 'V'));
		System.out.println(s);
		
		System.out.println("--------------");
		
		StringBuffer sb = new StringBuffer("SUNRAYS ");
		System.out.println(sb);
		System.out.println(sb.append("HOUSE"));
		System.out.println(sb);
	}

}
