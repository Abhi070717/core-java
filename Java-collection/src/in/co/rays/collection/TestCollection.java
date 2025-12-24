package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("Shayam");
		c.add(34);
		c.add(22400.50);
		c.add('a');
		c.add(true);
		c.add("Sharma");
		
		System.out.println(c);
		System.out.println(c.contains(22400.50));
		System.out.println(c.size());
		System.out.println(c.remove(22400.50));
		System.out.println(c.size());
		System.out.println(c.contains(22400.50));
		
		
		System.out.println("-----------------");
		
		for(Object o : c) {
			
			System.out.println(o);
		}
	}

}
