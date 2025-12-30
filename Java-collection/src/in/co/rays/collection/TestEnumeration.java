package in.co.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("ram");
		v.add("shayam");
		v.add("vikas");
		v.add("geeta");
		v.add('a');
		v.add(234);
		v.add(null);

		System.out.println(v);

		Enumeration e = v.elements();		//Only used in historical classes

		v.add("sundar");					//Not fail-fast/fail-safe

		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);

		}

		System.out.println(v);

	}

}
