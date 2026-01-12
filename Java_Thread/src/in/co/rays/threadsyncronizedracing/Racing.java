package in.co.rays.threadsyncronizedracing;


public class Racing extends Thread {

	String Name = null;

	public static Account acc = new Account();

	public Racing(String Name) {
		this.Name = Name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			acc.deposit(Name, 100);
		}
	}

}
