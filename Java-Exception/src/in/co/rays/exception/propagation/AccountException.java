package in.co.rays.exception.propagation;

public class AccountException {

	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setnumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccounttype(String accountType) {
		this.accountType = accountType;
	}

	public double getbalance() {
		return this.balance;

	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public void Deposit(double Deposit) {
		this.balance = this.balance + Deposit;
		System.out.println("Total balance after deposit:" + this.balance);
	}

	public void withdrawal(double withdrawal) throws Exception {
		if (withdrawal > this.balance) {
			throw new Exception("Insufficent fund withdrawal");
		} else {
			this.balance = this.balance - withdrawal;
			System.out.println("Total balance after withdrawal:" + this.balance);
		}
	}

	public void fundTransfer(AccountException target, double fundTransfer) throws Exception {
		if (fundTransfer > this.balance) {

			throw new Exception("Insufficent balance to Transfer:" + fundTransfer);
		} else {
			this.balance = this.balance - fundTransfer;
			target.balance = target.balance + fundTransfer;
			System.out.println("After Fund Transfer Remaining Amount is:" + this.balance);
		}
	}

	public void payBill(double payBill) {
		if (this.balance >= payBill) {
			this.balance = this.balance - payBill;
			System.out.println("Balance after bill payment:" + this.balance);
		} else {
			System.out.println("Insufficient balance to pay bill");
		}

	}

}
