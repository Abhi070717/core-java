package in.co.rays.oop.constructor;

public class Child extends Parent {

		public Child() {
		super(); 										// Call Parent Class default constructor
		}

		public Child(String name) {
			super(name);								// Call Parent class single parameterized constructor
		}

		public Child(String name, String address) {
			super(name, address);						// Call Parent class double parameterized constructor
		}

		public Child(String name, String address, int salary) {
			super(name, address, salary);				// Call Parent class triple parameterized constructor
		}

	}