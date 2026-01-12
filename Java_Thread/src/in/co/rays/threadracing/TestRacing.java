package in.co.rays.threadracing;

public class TestRacing {

	public static void main(String[] args) {

		Racing t1 = new Racing("Ram");
		Racing t2 = new Racing("shyam");

		t1.start();
		t2.start();
	}

}
