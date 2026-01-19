package in.co.rays.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee(101, "Prakash");
//		Employee e1 = new Employee(102, "Rajesh");
//		Employee e2 = new Employee(103, "Vijay");
//		Employee e3 = new Employee(104, "Prakhar");
//		Employee e4 = new Employee(105, "Gagan");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\Java\\IO\\Employee.txt"));

		out.writeObject(e);

		out.close();

		System.out.println("Employee Details Stored");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Java\\IO\\Employee.txt"));

		System.out.println(in.readObject());

		in.close();
	}

}