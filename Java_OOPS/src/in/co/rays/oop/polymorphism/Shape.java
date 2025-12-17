package in.co.rays.oop.polymorphism;

public class Shape {
	public void area() {
		System.out.println("Area of all shape");
	}

	public static Shape getShape(int i) {
		if (i == 1) {
			return new Circle();
		}
		if (i == 2) {
			return new Rectangle();
		}
		if (i == 3) {
			return new Triangle();
		}
		return new Shape();

	}

}
