package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("ram");
		l.add("shayam");
		l.add("vikas");
		l.add("geeta");
		l.add('a');
		l.add(234);
		l.add(null);

		System.out.println(l);

		Iterator it = l.iterator();		//Create it iterator object

		//l.add("yash");				//fail-fast ---->ConcurrentModificationException

		while (it.hasNext()) {			//hasNext check the next element
			Object o = it.next();		//next iterate the next element
			System.out.println(o);		//Print the next element
			it.remove();				//Remove the element

		}
		
		System.out.println(l);

	}

}
