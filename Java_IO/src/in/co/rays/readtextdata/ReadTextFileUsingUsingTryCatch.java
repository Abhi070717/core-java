package in.co.rays.readtextdata;

import java.io.FileReader;
import java.io.IOException;


public class ReadTextFileUsingUsingTryCatch {

	public static void main(String[] args) {

		FileReader file = null;

		try {
			file = new FileReader("D:\\Java\\IO\\Hello.txt");

			int i = file.read(); // file.read reads single character only as integer form

			while (i != -1) {
				System.out.println((char) i + " = " + i);
				i = file.read();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				file.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
