package in.co.rays.inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteValidEmailIds {

	public static void main(String[] args) throws Exception {

		FileReader source /*Or FileReader */ = new FileReader("D:\\Java\\IO\\PhoneNo.txt");
		FileWriter target /* Or FileWriter */ = new FileWriter("D:\\Java\\IO\\ValidPhoneNo.txt");

		BufferedReader br = new BufferedReader(source /*Or FileReader */);
		BufferedWriter bw = new BufferedWriter(target /* Or FileWriter */);

		String email = br.readLine();

		while (email != null) {

			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
				bw.write(email);
				bw.newLine();
			}
			email = br.readLine();
		}

		br.close();
		bw.close();

	}

}