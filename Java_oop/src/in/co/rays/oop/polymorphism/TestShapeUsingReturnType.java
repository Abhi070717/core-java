package in.co.rays.oop.polymorphism;

public class TestShapeUsingReturnType {
	public static void main(String[] args) {
		Shape1[] s = new Shape1[3];

		s[0] = Shape1.getShape(1);// new Circle();
		s[1] = Shape1.getShape(2);// new Rectangle();
		s[2] = Shape1.getShape(3);// new Triangle();

		Circle1 c = (Circle1) s[0];
		c.setRadius(4);
		Rectangle1 r = (Rectangle1) s[1];
		r.setLength(6);
		r.setWidth(8);
		Triangle1 t = (Triangle1) s[2];
		t.setBase(4);
		t.setHeight(6);

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}
	}

}
