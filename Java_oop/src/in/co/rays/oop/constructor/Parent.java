package in.co.rays.oop.constructor;

	public class Parent {

		private String name;
		private String address;
		private int salary;

		public Parent() {
			System.out.println("Default constructor: Parent");
		}

		public Parent(String name) {
			this(); 						// Call default constructor
			this.name = name;
			System.out.println("Name: " + this.name);
		}

		public Parent(String name, String address) {
			this(name);						// Call single parameterized constructor
			this.address = address;
			System.out.println("Address: " + this.address);
		}

		public Parent(String name, String address, int salary) {
			this(name, address);			// Call double parameterized constructor
			this.salary = salary;
			System.out.println("Salary: " + this.salary);
		}

	}
