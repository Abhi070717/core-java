package in.co.rays.oop.polymorphism;

public class TestPolymorphismUsingMethodArgument {

	public static void main(String[] args) {

		Shape1[] s = new Shape1[3];

		s[0] = new Circle1();
		s[1] = new Rectangle1();
		s[2] = new Triangle1();

		Circle1 c = (Circle1) s[0];
		c.setRadius(5);

		Rectangle1 r = (Rectangle1) s[1];
		r.setLength(5);
		r.setWidth(4);

		Triangle1 t = (Triangle1) s[2];
		t.setBase(6);
		t.setHeight(8);

		getArea(s);

	}

	public static void getArea(Shape1[] s) {
		double totalArea = 0.0;
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());

			totalArea = totalArea + s[i].area();
		}

		System.out.println("Total Area: " + totalArea);

	}
}
