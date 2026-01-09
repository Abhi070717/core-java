package in.co.rays.threads;

public class HiThread extends Thread {

	private String Name;

	public HiThread(String Name) {

		this.Name = Name;

	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "=" + Name);
		}
	}

}
