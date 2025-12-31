package in.co.rays.collectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet("Abhi", 001, 67, 77);
		Marksheet m2 = new Marksheet("Abhishek", 004, 34, 56);
		Marksheet m3 = new Marksheet("Chirag", 005, 67, 23);
		Marksheet m4 = new Marksheet("Akshat", 003, 34, 85);
		Marksheet m5 = new Marksheet("Bhavesh", 002, 54, 15);
		Marksheet m6 = new Marksheet("Abhinav", 006, 45, 65);
		
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		
		//list.add(null);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
