package in.co.rays.collectionSorting;

import java.util.Comparator;

public class OrderBySalaryDescending implements Comparator<EmployeeUsingComparator> {

	@Override
	public int compare(EmployeeUsingComparator o1, EmployeeUsingComparator o2) {
		return o2.salary - o1.salary;												//Sort in Descending order
		
		
	}

}
