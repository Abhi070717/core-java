package in.co.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestantWinner {

	public static void main(String[] args) {

		ArrayList<Contestant> list = new ArrayList<Contestant>();
		list.add(new Contestant("Aman", "9123456789"));
		list.add(new Contestant("Rohan", "9234567890"));
		list.add(new Contestant("Neeraj", "9345678901"));
		list.add(new Contestant("Sohan", "9234567890"));
		list.add(new Contestant("Kunal", "9567890123"));
		list.add(new Contestant("Deepak", "9123456789"));
		list.add(new Contestant("InvalidUser", "12345"));
		
		System.out.println("All Phones of Contestant:");

		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).forEach(System.out::println); // print filter phone number

		System.out.println("All Phones of Contestant without Duplicates:");

		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct().forEach(System.out::println); // remove duplicacy

		System.out.println("Phones of the winner Contestant:");

		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(1).forEach(System.out::println);

	}

}
