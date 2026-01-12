package in.co.rays.threadracing;

public class Account {
	
	private int balance = 0;

	public int getBalance() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;
	}
	public void deposit(String Name, int money) {
		
		int total = getBalance() + money;
		
		setBalance(total);
		
		System.out.println(Name + " = " + getBalance());
	}
	
	

}
