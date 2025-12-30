package in.co.rays.collectionSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) { //Sorted set automatically sorted in ascending order

		SortedSet s = new TreeSet();		//Remove the duplicate char set contain one elements
		

		s.add('a');
		s.add('c');
		s.add('b');
		s.add('a');
		//s.add(null);						//Not store null values come NullPointerException
		
		System.out.println(s);

	}

}
