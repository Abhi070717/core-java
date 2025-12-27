package in.co.rays.oop.polymorphism;

public class Shape1 {
	public double area() {
		return 0.0;  //Finding Total Area
	}

	public static Shape1 getShape(int i) {
		if (i == 1) {
			return new Circle1();
		}
		if (i == 2) {
			return new Rectangle1();
		}
		if (i == 3) {
			return new Triangle1();
		}
		return new Shape1();

	}

}
