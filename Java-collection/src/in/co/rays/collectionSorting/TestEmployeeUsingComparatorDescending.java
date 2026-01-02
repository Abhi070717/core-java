package in.co.rays.collectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeUsingComparatorDescending {

	public static void main(String[] args) {

		EmployeeUsingComparator e1 = new EmployeeUsingComparator(101, "Abhi", 88000);
		EmployeeUsingComparator e2 = new EmployeeUsingComparator(104, "Abhishek", 58000);
		EmployeeUsingComparator e3 = new EmployeeUsingComparator(103, "Chirag", 45000);
		EmployeeUsingComparator e4 = new EmployeeUsingComparator(102, "Rajan", 8000);
		EmployeeUsingComparator e5 = new EmployeeUsingComparator(106, "Abhinav", 9700);
		EmployeeUsingComparator e6 = new EmployeeUsingComparator(105, "Samar", 45000);

		List<EmployeeUsingComparator> list = new ArrayList<EmployeeUsingComparator>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		System.out.println(list);

		OrderByIdDescending ById = new OrderByIdDescending();
		Collections.sort(list, ById);

		System.out.println(list);

		OrderByNameDescending ByName = new OrderByNameDescending();
		Collections.sort(list, ByName);
		System.out.println(list);

		OrderBySalaryDescending BySalary = new OrderBySalaryDescending();
		Collections.sort(list, BySalary);
		System.out.println(list);
	}

}
