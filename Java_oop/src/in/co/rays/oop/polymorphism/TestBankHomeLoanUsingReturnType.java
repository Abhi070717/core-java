package in.co.rays.oop.polymorphism;

public class TestBankHomeLoanUsingReturnType {
	public static void main(String[] args) {

		Bank[] b = new Bank[3];

		b[0] = Bank.getBank(1); // new AxisBank();
		b[1] = Bank.getBank(2); // new HDFCBank();
		b[2] = Bank.getBank(3); // new ICICIBank();

		loanEnquiry(b);
	}

	static void loanEnquiry(Bank[] b) {
		for (Bank b1 : b) {
			String name = b1.getName();
			double rate = b1.interestRate();
			System.out.println(name + " = " + rate);

		}
	}
}