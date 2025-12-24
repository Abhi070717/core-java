package in.co.rays.oop.polymorphism;

public class TestPolymorphismUsingMethodArgument1 {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(5);

		Rectangle r = (Rectangle) s[1];
		r.setLength(5);
		r.setWidth(4);

		Triangle t = (Triangle) s[2];
		t.setBase(6);
		t.setHeight(8);

		getArea(s);

	}

	public static void getArea(Shape[] s) {

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}
}