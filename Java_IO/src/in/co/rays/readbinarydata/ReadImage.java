package in.co.rays.readbinarydata;

import java.io.FileInputStream;

public class ReadImage {
	public static void main(String[] args) throws Exception {

		String FileReader = "D:\\Java\\IO\\Doraemon.png";

		FileInputStream in = new FileInputStream(FileReader); 			// Read Binary File

		int i = in.read();
		while (i != -1) {

			System.out.println(i);
			i = in.read();

		}

		in.close();
	}

}
