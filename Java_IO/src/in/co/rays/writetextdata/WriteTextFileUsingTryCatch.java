package in.co.rays.writetextdata;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileUsingTryCatch {

	public static void main(String[] args) {
		FileWriter file = null;
		try {

//			file = new FileWriter("D://IO//Sun.txt");
			file = new FileWriter("D:\\Java\\IO\\Hello.txt", true);
			file.write(" \nHello Rays");

			System.out.println("text data write successfully");

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
