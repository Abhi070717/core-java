package in.co.rays.writebinarydata;

import java.io.FileInputStream;

public class WriteImage1 {
	
	public static void main(String[] args) throws Exception {

		String FileWriter = "C:\\Users\\LAPTOP WORLD\\Downloads\\Doraemon Character.jpg";

		FileInputStream in = new FileInputStream(FileWriter); 							// write Binary File

		in.close();
		System.out.println("Done: " + in);
	}

}
