package in.co.rays.oop.polymorphism;

public class Triangle1 extends Shape1 {
	private int Base;
	private int Height;

	public int getBase() {
		return Base;
	}

	public void setBase(int base) {
		Base = base;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	@Override
	public double area() {
		return 1 * (Base * Height) / 2;
	}

}
