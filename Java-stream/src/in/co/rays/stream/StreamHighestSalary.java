package in.co.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHighestSalary {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();

		list.add(1000);
		list.add(5000);
		list.add(2000);
		list.add(4000);
		list.add(3000);
		list.add(7000);
		list.add(3000);
		list.add(10000);
		list.add(5000);
		
		list.stream().sorted().forEach(System.out::println);		//sort the list

		System.out.println("  ");

		list.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);		//reverse the list

		System.out.println("  ");

		System.out.println("---first largest salary---");
		list.stream().distinct().sorted(Collections.reverseOrder()).limit(1).forEach(System.out::println);		//First highest salary

		System.out.println("---second largest salary---");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);		//Second highest salary

	}

}
