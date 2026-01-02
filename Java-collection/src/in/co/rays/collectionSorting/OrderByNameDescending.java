package in.co.rays.collectionSorting;

import java.util.Comparator;

public class OrderByNameDescending implements Comparator<EmployeeUsingComparator> {

	@Override
	public int compare(EmployeeUsingComparator o1, EmployeeUsingComparator o2) {
		return o2.name.compareTo(o1.name);											//Sort in Descending order
	}
}
