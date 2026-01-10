package in.co.rays.demon;

public class DemonThread extends Thread {

	String name = null;

	public DemonThread(String name) {

		this.name = name;

	}

	@Override
	public void run() {

		while (true) {

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}
//		for (int i = 1; i <= 15; i++) {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			
//			System.out.println(i + "=" + name);

			System.out.println(name);
		}
	}
}
