package in.co.rays.collection;

public class AutoBoxingAndUnBoxing {

	public static void main(String[] args) {

		int a = 9;
		// Integer b = new Integer(a); 				//old AutoBoxing
		Integer b = a; 								// New AutoBoxing
		int k = b; 									// Unboxing

		System.out.println(Integer.max(2, 8));

		String s = "17072002";
		//String s = "17July2002"; 				//java.lang.NumberFormatException: For input string:"17July2002"
		int i = Integer.parseInt(s);
		
		System.out.println(s);
		System.out.println(i);
		
		Double d = 2322.98;
		String r = String.valueOf(d);
		
		System.out.println(r);
		
		long c = 407;
		String l = String.valueOf(c);
		
		System.out.println(l);

	}

}
