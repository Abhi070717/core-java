package in.co.rays.oop.abstraction;

public class Triangle extends Shape {

	private int height;
	private int base;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public double area() {

		return ((base * height) * 1/ 2);
	}

}
