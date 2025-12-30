package in.co.rays.map;

import java.util.SortedMap;
import java.util.TreeMap;

// SortedMap order map in ascending order

public class TestSortedMap {

	public static void main(String[] args) {

		SortedMap m = new TreeMap();

		m.put(3, "C");
		m.put(1, "A");
		m.put(2, "B");
		//m.put(null, "D");				//sorted map not include null key 

		System.out.println("sorting map: " + m);

	}

}
