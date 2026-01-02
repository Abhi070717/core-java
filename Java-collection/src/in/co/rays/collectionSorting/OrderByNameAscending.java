package in.co.rays.collectionSorting;

import java.util.Comparator;

public class OrderByNameAscending implements Comparator<EmployeeUsingComparator> {

	@Override
	public int compare(EmployeeUsingComparator o1, EmployeeUsingComparator o2) {
		return o1.name.compareTo(o2.name); 											//Sort in Ascending order
	}

}
