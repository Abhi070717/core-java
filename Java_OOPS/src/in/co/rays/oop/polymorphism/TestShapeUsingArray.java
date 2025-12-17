package in.co.rays.oop.polymorphism;

public class TestShapeUsingArray {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(2);

		Rectangle r = (Rectangle) s[1];
		r.setLength(4);
		r.setWidth(6);

		Triangle t = (Triangle) s[2];
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
