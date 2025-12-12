package in.co.rays.opps.inheritance;

public class Circle extends Shape{
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void area() {
		System.out.println("area of circle: " + (Math.PI * radius * radius));
	}
	

}
