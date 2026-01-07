package in.co.rays.inputoutput;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class TestSplit {

	public static void main(String[] args) throws Exception {

		BufferedReader file = new BufferedReader(new FileReader("D:\\Java\\IO\\AllName.txt"));

		String line = file.readLine();

		while (line != null) {
			System.out.println(line);
			line = file.readLine();

			String fileWriter = "D:\\Java\\IO\\Abhishish.txt";

			FileOutputStream out = new FileOutputStream(fileWriter); // Write binary data

			int i = file.read();

			while (i != -1) {

				System.out.println(i);
				// i.new filewriter ;

				out.write(i);

				i = file.read();

			}
		}
	}
}
