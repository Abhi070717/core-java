package in.co.rays.collection.collection-list;

import java.util.ArrayList;
import java.util.List;

public class TestLinkedlist {
	
	public static void main(String[] args) {
		
		List list = new ArrayList(); 
		
		list.add(0, "Vishnu");
		list.add(1, null);
		list.add(2, "Raman");
		list.add(3, "Baman");
		list.add(4, 5.55);
		list.add(5, "Vishnu");
		list.add(6, null);
		list.add(7, 'T');
		list.add(8, false);
		
		System.out.println(list);
		
		System.out.println(list.get(5));
		
	}

}
