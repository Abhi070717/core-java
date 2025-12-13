package in.co.rays.opps.inheritance;

public class Businessman extends Person {
	private double income;

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
		if (income >= 100000 && 10000000 > income) {
			System.out.println("*Valid income elegible for loan*");
		} else {
			System.out.println("*Invalid income not elegible for loan*");
		}
	}

}
