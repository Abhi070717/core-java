package in.co.rays.oop.polymorphism;

public class TestShapeUsingReturnType {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];

		s[0] = Shape.getShape(1);// new Circle();
		s[1] = Shape.getShape(2);// new Rectangle();
		s[2] = Shape.getShape(3);// new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(4);
		Rectangle r = (Rectangle) s[1];
		r.setLength(6);
		r.setWidth(8);
		Triangle t = (Triangle) s[2];
		t.setBase(4);
		t.setHeight(6);

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}

}
