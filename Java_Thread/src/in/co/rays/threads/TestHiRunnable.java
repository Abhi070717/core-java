package in.co.rays.threads;

public class TestHiRunnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new HiRunnable("Abhi"));
		Thread t2 = new Thread(new HiRunnable("Bhawsar"));

		t1.start();
		t2.start();
	}

}
