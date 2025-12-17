package in.co.rays.oop.polymorphism;

public class TestBankHomeLoanUsingArray {
	public static void main(String[] args) {
		Bank[] b = new Bank[3];

		b[0] = new AxisBank();
		b[1] = new HDFCBank();
		b[2] = new ICICIBank();

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
