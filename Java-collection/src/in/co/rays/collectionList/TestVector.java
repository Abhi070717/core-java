package in.co.rays.collectionList;

import java.util.List;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		List v = new Vector();

		v.add(0, "Vishnu");
		v.add(1, null);
		v.add(2, "Raman");
		v.add(3, "Baman");
		v.add(4, 5.55);
		v.add(5, "Vishnu");
		v.add(6, null);
		v.add(7, 'T');
		v.add(8, false);

		System.out.println(v);

		System.out.println(v.get(4));

	}

}
