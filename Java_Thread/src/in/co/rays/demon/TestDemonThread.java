package in.co.rays.demon;

public class TestDemonThread {

	public static void main(String[] args) {

		DemonThread t1 = new DemonThread("demon thread");

//		t1.setDemon(true);			//t1 is now demon thread

		t1.start();

		for (int i = 1; i <= 100; i++) {

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(i + " main");

		}
//		t1.stop(); 				//forcefully Stop the t1 Thread
	}

}
