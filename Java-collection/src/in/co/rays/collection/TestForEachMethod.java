package in.co.rays.collection;

import java.util.ArrayList;

public class TestForEachMethod {

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
		
		System.out.println(list);
		
		System.out.println(" ");
		
		System.out.println("-----Using forEach Method------");

		System.out.println(" ");

		list.forEach(System.out::println);				//forEach Method Used

	}

}
