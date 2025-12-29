package in.co.rays.propagationException;

public class TestAccountException {

	public static void main(String[] args) throws Exception {
		AccountException Ram = new AccountException();

		Ram.setnumber("97864224600005");
		Ram.setAccounttype("saving");
		Ram.setbalance(100.65);

		System.out.println("Ram's Account Number:" + Ram.getNumber());
		System.out.println("Ram's Account Type:" + Ram.getAccountType());
		System.out.println("Ram's Account Balance:" + Ram.getbalance());
		Ram.Deposit(400);
		Ram.withdrawal(250);
		// Ram.fundTransfer(750);
		Ram.payBill(350);

		System.out.println("------------------------");

		AccountException Shayam = new AccountException();

		Shayam.setnumber("45637895436543");
		Shayam.setAccounttype("Current");
		Shayam.setbalance(100.66);

		System.out.println("Shayam's Account Number:" + Shayam.getNumber());
		System.out.println("Shayam's Account Type:" + Shayam.getAccountType());
		System.out.println("Shayam's Account Balance:" + Shayam.getbalance());
		Shayam.Deposit(600);
		Shayam.withdrawal(700);
		Shayam.fundTransfer(Ram, 200);
		Shayam.payBill(299);
		Ram.fundTransfer(Shayam, 150);
	}

}
