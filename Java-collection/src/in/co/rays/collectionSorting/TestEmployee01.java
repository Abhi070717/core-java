package in.co.rays.collectionSorting;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee01 {

	public static void main(String[] args) {

		EmployeeUsingComprable e1 = null, e2 = null, e3 = null, e4 = null, e5 = null, e6 = null, e7 = null, e8 = null, e9 = null, e10 = null;
		try {																		//through try catch method
			e1 = new EmployeeUsingComprable("Abhishish Bhawsar", 12101, "2022-07-17", 58000, "TCS");
			e2 = new EmployeeUsingComprable("Tarun Yadav", 12102, "2023-04-01", 45000, "Infosis");
			e3 = new EmployeeUsingComprable("Abhijeet Sharma", 12103, "2023-05-05", 56000, "Cognizent");
			e4 = new EmployeeUsingComprable("Vijay Kirar", 12108, "2024-11-07", 30000, "NCS");
			e5 = new EmployeeUsingComprable("Amit Soni", 12105, "2024-07-11", 23000, "Yash Technology");
			e6 = new EmployeeUsingComprable("Raman Gupta", 12107, "2023-03-12", 45300, "Mindtree L&T");
			e7 = new EmployeeUsingComprable("Raj Singh", 12104, "2024-12-12", 32100, "Zensar");
			e8 = new EmployeeUsingComprable("Rajveer Pal", 12106, "2025-12-25", 55000, "TaskUs");
			e9 = new EmployeeUsingComprable("Adhiraj Singh", 12107, "2024-07-05", 54000, "HCL");
			e10 = new EmployeeUsingComprable("Akshay Jain", 12108, "2024-01-25", 56800, "Rakuten");
			
		} catch (ParseException e) {

		}

		ArrayList<EmployeeUsingComprable> Elist = new ArrayList<EmployeeUsingComprable>();

		Elist.add(e1);
		Elist.add(e2);
		Elist.add(e3);
		Elist.add(e4);
		Elist.add(e5);
		Elist.add(e6);
		Elist.add(e7);
		Elist.add(e8);
		Elist.add(e9);
		Elist.add(e10);

		System.out.println(Elist);

		Collections.sort(Elist);

		System.out.println(Elist);

	}

}
