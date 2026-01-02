package in.co.rays.collectionSorting;

import java.util.Comparator;

public class OrderByIdDescending implements Comparator<EmployeeUsingComparator>{
	
	@Override
	public int compare(EmployeeUsingComparator o1, EmployeeUsingComparator o2) {
		return o2.Id - o1.Id;														//Sort in Descending order
	}

}
