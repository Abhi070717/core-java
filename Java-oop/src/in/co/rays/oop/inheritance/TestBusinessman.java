package in.co.rays.oop.inheritance;

public class TestBusinessman {

	public static void main(String[] args) {

		Businessman b1 = new Businessman();

		b1.setName("Mahesh Rao");
		b1.setAddress("Indore");
		b1.setIncome(100000.00);

		System.out.println("Businessman's Name: " + b1.getName());
		System.out.println("Businessman's Address: " + b1.getAddress());

		System.out.println("Businessman's yearly salary: " + b1.getIncome());
		b1.getIncome();

	}

}
