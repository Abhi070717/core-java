package in.co.rays.oop.abstraction;

public class TestShapeUsingAbstraction {
	public static void main(String[] args) {
		Shape s1 = new Circle();

		Circle c = (Circle) s1;
		c.setRadius(4);

		System.out.println("Area of circle: " + c.area());

		Shape s2 = new Rectangle();

		Rectangle r = (Rectangle) s2;
		r.setLength(6);
		r.setWidth(4);

		System.out.println("Area of rectangle: " + r.area());

		Shape s3 = new Triangle();

		Triangle t = (Triangle) s3;
		t.setBase(6);
		t.setHeight(8);

		System.out.println("Area of triangle: " + t.area());
	}
}