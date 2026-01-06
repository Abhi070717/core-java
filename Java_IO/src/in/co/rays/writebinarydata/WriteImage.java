package in.co.rays.writebinarydata;

import java.io.FileInputStream;

public class WriteImage {

	public static void main(String[] args) throws Exception {

		String FileWriter = "D:\\Java\\IO\\Doraemon.png";

		FileInputStream in = new FileInputStream(FileWriter); 							// write Binary File

//				in.write("C:\\Users\\LAPTOP WORLD\\Downloads\\Doraemon Character.jpg");
//				in.newLine();

		in.close();
		System.out.println("Done: " + in);
	}

}
