package in.co.rays.collectionSet;

import java.util.HashSet;
import java.util.Set;

//1. set contain unique elements
//2. set contain one null elements
//3. order of set does not define

public class TestSet {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();				//Set arrange in ascending order
		
		s.add('a');
		s.add('a');
		s.add('b');
		s.add('e');
		s.add('d');
		s.add('c');
		s.add(null);
		s.add(null);
		
		System.out.println(s);
	}

}
