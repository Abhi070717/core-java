package in.co.rays.readbinarydata;

import java.io.FileInputStream;

public class ReadImage1 {

	public static void main(String[] args) throws Exception {

		String FileReader = "C:\\Users\\LAPTOP WORLD\\Downloads\\Doraemon Character.jpg";

		FileInputStream in = new FileInputStream(FileReader); // Read Binary File

		int i = in.read();
		while (i != -1) {

			System.out.println(i);
			i = in.read();

		}

		in.close();
	}

}
