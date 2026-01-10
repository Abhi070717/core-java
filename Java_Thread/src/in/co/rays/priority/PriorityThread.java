package in.co.rays.priority;

public class PriorityThread extends Thread {

	public String Name = null;

	public PriorityThread(String Name) {

		this.Name = Name;

	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "=" + Name);
		}
	}

}
