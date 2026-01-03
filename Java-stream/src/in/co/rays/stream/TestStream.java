package in.co.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStream {
	
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
		
		System.out.println("*Normal List Print*");
		
		System.out.println("  ");

		
		list.forEach(System.out::println);
		
		System.out.println("  ");
		
		System.out.println("*Sorted List In Stream*");
		
		System.out.println("  ");
		
		list.stream().sorted().forEach(System.out::println);		//Print in Ascending order
		
		System.out.println("  ");
		
		System.out.println("*Sorted in reverse order*");
		
		System.out.println("  ");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("  ");
		
		list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);		//Distinct Remove Duplicacy
		
		System.out.println("  ");

		System.out.println("----Map Method----");				//Stream not store data and any operation er performed in past 
		
		System.out.println("  ");

		list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);							//Using map methods convert to lower case 
		
		System.out.println("  ");

		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);							//Using map methods convert to Upper case
		
		System.out.println("  ");
		
		System.out.println("----Filter Method----");
		
		System.out.println("  ");
		
		list.stream().filter(e -> e.startsWith("s")).distinct().forEach(System.out::println);			//Due to List Store with first letter in upper case
		
		System.out.println(" ");
		
		list.stream().filter(e -> e.startsWith("S")).distinct().forEach(System.out::println);


	}

}
