package in.co.rays.readtextdata;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferedReader01 {

	public static void main(String[] args) throws Exception {

		BufferedReader file = new BufferedReader(new FileReader("D:\\Java\\IO\\HelloWorld.txt"));

		String line = file.readLine();

		while (line != null) {
			System.out.println(line);
			line = file.readLine();
		}

		file.close();

	}

}