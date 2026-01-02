package in.co.rays.collectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		MarksheetUsingComprable m1 = new MarksheetUsingComprable("Abhi", 001, 67, 77);
		MarksheetUsingComprable m2 = new MarksheetUsingComprable("Abhishek", 004, 34, 56);
		MarksheetUsingComprable m3 = new MarksheetUsingComprable("Chirag", 005, 67, 23);
		MarksheetUsingComprable m4 = new MarksheetUsingComprable("Akshat", 003, 34, 85);
		MarksheetUsingComprable m5 = new MarksheetUsingComprable("Bhavesh", 002, 54, 15);
		MarksheetUsingComprable m6 = new MarksheetUsingComprable("Abhinav", 006, 45, 65);
		
		ArrayList<MarksheetUsingComprable> list = new ArrayList<MarksheetUsingComprable>();
		
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
