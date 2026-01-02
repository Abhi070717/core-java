package in.co.rays.collectionSorting;

import java.util.Comparator;

public class OrderBySalaryAscending implements Comparator<EmployeeUsingComparator> {

	@Override
	public int compare(EmployeeUsingComparator o1, EmployeeUsingComparator o2) {
		return o1.salary - o2.salary;												//Sort in ascending order
		
		
	}

}
