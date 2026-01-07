package in.co.rays.inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteValidPhoneNo {
	
	public static void main(String[] args) throws Exception {

		FileReader source /*Or FileReader */ = new FileReader("D:\\Java\\IO\\PhoneNo.txt");
		FileWriter target /* Or FileWriter */ = new FileWriter("D:\\Java\\IO\\ValidPhoneNo.txt");

		BufferedReader br = new BufferedReader(source /*Or FileReader*/);
		BufferedWriter bw = new BufferedWriter(target /* Or FileWriter */);

		String PhoneNo = br.readLine();

		while (PhoneNo != null) {

			if (PhoneNo.length() == 10) {				//we use regics for Actual phone formate   
				System.out.println(PhoneNo);
				bw.write(PhoneNo);
				bw.newLine();
			}
			PhoneNo = br.readLine();
		}

		br.close();
		bw.close();
	}

}
