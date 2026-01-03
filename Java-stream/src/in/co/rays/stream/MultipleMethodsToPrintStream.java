package in.co.rays.stream;

import java.util.ArrayList;

public class MultipleMethodsToPrintStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("Manav");
		list.add("Charan");
		list.add("Baman");
		list.add("Varun");
		list.add("Sunny");
		list.add("Sunny");
		list.add("Sunny");
		list.add("Rajveer");
		list.add("Abhishek");
		
		//list.forEach(System.out::println); //1st way to print
		
		list.forEach(e -> {
			System.out.println(e);		//2nd way to print
		});
		
	}

}
