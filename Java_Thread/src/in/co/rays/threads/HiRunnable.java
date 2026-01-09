package in.co.rays.threads;

public class HiRunnable implements Runnable {

	private String Name;
	
	public HiRunnable(String Name) {
		this.Name = Name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "=" + Name);
		}
	}

}
