package in.co.rays.collectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestSortingAndSuffling {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Abhishish");
		list.add("Bhawsar");
		list.add("Indore");
		list.add("Engineer");
//			list.add(23); // compilation error

		System.out.println(list);

		System.out.println("----------");

		Collections.sort(list);

		System.out.println(list);

		System.out.println("----------");

		Collections.shuffle(list);

		System.out.println(list);

	}

}
