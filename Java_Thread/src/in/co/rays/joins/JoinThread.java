package in.co.rays.joins;

public class JoinThread extends Thread {

	String Name = null;

	public JoinThread(String Name) {
		this.Name = Name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 15; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "=" + Name);
		}
	}

}
