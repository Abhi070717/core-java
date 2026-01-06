package in.co.rays.writetextdata;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TestBufferedWriter01 {

	public static void main(String[] args) throws Exception {

		BufferedWriter file = new BufferedWriter(new FileWriter("D:\\Java\\IO\\Hello java.txt", true));

		file.write("\npublic class HelloWorld {");
		file.newLine();
		file.write("	public static void main(String[] args) {");
		file.newLine();
		file.write("		System.out.println(\"Hello World \");");
		file.newLine();
		file.write(" }" + "\n" + "}");

		System.out.println("Java file write successfully");

		file.close();
	}

}
