package in.co.rays.collectionSorting;

public class EmployeeUsingComparator {

	protected int Id;
	protected String name;
	protected int salary;

	public EmployeeUsingComparator(int Id, String name, int salary) {

		this.Id = Id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Clint Id: " + Id + "| Name: " + name + "| Clint salary: " + salary+ "\n";
	}

}
