package in.co.rays.oop.polymorphism;

public class Triangle extends Shape{
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
	public void area() {
		System.out.println("Area of triangle: " + 1*(Base*Height)/2);
	}

}
