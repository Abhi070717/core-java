package in.co.rays.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryData {

	public static void main(String[] args) throws IOException {

		String source = "D:\\Java\\IO\\Doraemon.png";							//source = FileReader

		String target = "D:\\Java\\IO\\Doraemon.png";							//target = FileWriter

		FileInputStream in = new FileInputStream(source); 								// Read binary data

		FileOutputStream out = new FileOutputStream(target); 							// Write binary data

		int i = in.read();

		while (i != -1) {

			System.out.println(i);
			
			out.write(i);

			i = in.read();

		}

		in.close();
		out.close();
		
		System.out.println("Successful Completed......");

	}

}
