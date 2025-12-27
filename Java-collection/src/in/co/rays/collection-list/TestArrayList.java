package in.co.rays.collection.collection-list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(0, "Vishnu");
		list.add(1, null);
		list.add(2, "Raman");
		list.add(3, "Ram");
		list.add(4, 5.55);
		list.add(5, "Vishnu");
		list.add(6, null);
		list.add(7, 'T');
		list.add(8, false);

		System.out.println(list);

		System.out.println(list.get(6));

		System.out.println(list.get(2));
		System.out.println(list.get(7));
		
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(2));
		
		System.out.println("----------");
		System.out.println(list.get(1));
		System.out.println(list.indexOf("Vishnu"));
		System.out.println(list.lastIndexOf("Ram"));
		
		System.out.println("-----------");
		list.set(1, "Rawan");
		System.out.println(list.get(1));
		
		System.out.println(list.subList(1, 7));

	}

}
