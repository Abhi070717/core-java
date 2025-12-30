package in.co.rays.map;

import java.util.HashMap;
import java.util.Map;

//1. map contain key and value pair
//2. in map key represent value
//3. map contain unique key only
//4. map contain duplicate value
//5. map contain only one null key
//6. map contain multiple null value

public class TestHashMap {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put("First ", 1); 		// First = 1
		m.put("Second ", 2); 		// Second = 2
		m.put("Third ", 3); 		// Third = 3
		m.put("Fourth ", 4); 		// Fourth = 4
		m.put("Fifth ", 5); 		// Fifth = 5
		m.put(null, 5);

		System.out.println(m);
		System.out.println(m.get("two"));
		System.out.println("Sixth key: " + m.containsKey("Sixth")); 	// containsKey check key members
		System.out.println("Fifth key: " + m.containsKey("Fifth"));
		System.out.println("6 value: " + m.containsValue(6)); 			// containsValue check value members
		System.out.println("5 value: " + m.containsValue(5));
		System.out.println("------------");
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		System.out.println("----------------");
		System.out.println(m.remove("Fifth"));
		System.out.println(m);
		m.clear();
		System.out.println(m);
		System.out.println(m.get(null));

	}

}
