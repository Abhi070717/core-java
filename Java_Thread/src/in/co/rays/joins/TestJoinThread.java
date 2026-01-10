package in.co.rays.joins;

public class TestJoinThread {

	public static void main(String[] args) throws InterruptedException {

		JoinThread t1 = new JoinThread("Abhi");
		JoinThread t2 = new JoinThread("Bhawsar");

		t1.start();

		t1.join();

		t2.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "=" + "Main Thread");
		}
	}

}
