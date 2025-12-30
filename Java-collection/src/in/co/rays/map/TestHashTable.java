package in.co.rays.map;

import java.util.Hashtable; 
import java.util.Map;

public class TestHashTable {

	public static void main(String[] args) {		//hashTable has class

		Map m = new Hashtable();

		m.put("First", 1); 				// one = 1
		m.put("Second", 2); 			// two = 2
		m.put("Third", 3); 				// three = 3
		m.put("Fourth", 4); 			// four = 4
		m.put("Fifth", 5); 				// five = 5

		System.out.println(m);
		System.out.println(m.get("Second"));
		System.out.println("Sixth key: " + m.containsKey("Sixth")); 	// containsKey check key members
		System.out.println("Fifth key: " + m.containsKey("Fifth"));
		System.out.println("6 value: " + m.containsValue(6)); 			// containsValue check value members
		System.out.println("5 value: " + m.containsValue(5));
		System.out.println("----------------");
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		System.out.println("----------------");
		System.out.println(m.remove("five"));
		System.out.println(m);
		m.clear();
		System.out.println(m);

	}

}
