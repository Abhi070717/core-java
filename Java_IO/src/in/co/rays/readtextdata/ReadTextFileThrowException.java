package in.co.rays.readtextdata;

import java.io.FileReader;

public class ReadTextFileThrowException {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("D:\\Java\\IO\\Hello.txt");

		int i = file.read(); 					// file.read reads single character only as integer form

		while (i != -1) {
			System.out.println((char) i + " = " + i);
			i = file.read();
		}

		file.close();

	}

}
