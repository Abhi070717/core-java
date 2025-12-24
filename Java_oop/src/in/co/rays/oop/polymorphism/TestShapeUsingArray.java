package in.co.rays.oop.polymorphism;

public class TestShapeUsingArray {
	public static void main(String[] args) {
		Shape1[] s = new Shape1[3];
		s[0] = new Circle1();
		s[1] = new Rectangle1();
		s[2] = new Triangle1();

		Circle1 c = (Circle1) s[0];
		c.setRadius(2);

		Rectangle1 r = (Rectangle1) s[1];
		r.setLength(4);
		r.setWidth(6);

		Triangle1 t = (Triangle1) s[2];
		t.setBase(4);
		t.setHeight(8);

		for (int i = 0; i < s.length; i++) {
			s[i].area();

			// s[0].area();
			// s[1].area();
			// s[2].area();
		}
	}

}
