package in.co.rays.opps.encaptulation;

public class TestAccount {
	public static void main(String[] args) {
		Account Ram = new Account();

		Ram.setnumber("95108423000021");
		Ram.setAccountype("Saving");
		Ram.setbalance(3454.76);

		System.out.println("Ram's Account Number: " + Ram.getNumber());
		System.out.println("Ram's Account Type: " + Ram.getAccountType());
		System.out.println("Ram's Account Balance: " + Ram.getbalance());
		Ram.Deposit(500);
		Ram.withdrawal(400);
		// Ram.fundTransfer(850);
		Ram.payBill(349);

		System.out.println("--------------------------------------");

		Account Shayam = new Account();

		Shayam.setnumber("95108423454523");
		Shayam.setAccountype("Current");
		Shayam.setbalance(30540.55);

		System.out.println("Shayam's Account Number: " + Shayam.getNumber());
		System.out.println("Shayam's Account Type: " + Shayam.getAccountType());
		System.out.println("Shayam's Account Balance: " + Shayam.getbalance());
		Shayam.Deposit(600);
		Shayam.withdrawal(700);
		Shayam.fundTransfer(Ram, 100);
		Shayam.payBill(199);
		Ram.fundTransfer(Shayam, 50);
	}

}
