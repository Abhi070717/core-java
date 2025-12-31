package in.co.rays.collectionSorting;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {

	public static void main(String[] args) throws ParseException {

		Employee e1 = new Employee("Abhishish Bhawsar", 12101,"2022-07-17",  58000, "TCS");
		Employee e2 = new Employee("Tarun Yadav", 12102, "2023-04-01", 45000, "Infosis");
		Employee e3 = new Employee("Abhijeet Sharma", 12103, "2023-05-05", 56000, "Cognizent");
		Employee e4 = new Employee("Vijay Kirar", 12108, "2024-11-07", 30000, "NCS");
		Employee e5 = new Employee("Amit Soni", 12105, "2024-07-11", 23000, "Yash Technology");
		Employee e6 = new Employee("Raman Gupta", 12107, "2023-03-12", 45300, "Mindtree L&T");
		Employee e7 = new Employee("Raj Singh", 12104, "2024-12-12", 32100, "Zensar");
		Employee e8 = new Employee("Rajveer Pal", 12106, "2025-12-25", 55000, "TaskUs");
		Employee e9 = new Employee("Adhiraj Singh", 12107, "2024-07-05", 54000, "HCL");
		Employee e10 = new Employee("Akshay Jain", 12108, "2024-01-25", 56800, "Rakuten");

		ArrayList<Employee> Elist = new ArrayList<Employee>();

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
