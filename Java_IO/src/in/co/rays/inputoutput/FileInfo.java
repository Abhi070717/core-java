package in.co.rays.inputoutput;

import java.io.File;

import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File file = new File("D:\\Java\\IO\\Hello.txt"); 		// add file with path and open

		if (file.exists()) {

			System.out.println("Name of the file: " + file.getName());		//Get Details of the file

			System.out.println("Path of the file: " + file.getAbsolutePath());
			System.out.println("Path of the file: " + file.getAbsolutePath());

			System.out.println("--Access Parmission--");
			System.out.println("Readable form: " + file.canRead());
			System.out.println("Writable form: " + file.canWrite());

			System.out.println("--Check if it is Folder/Directory or a File--");
			System.out.println("File is Exist: " + file.isFile());
			System.out.println("Directory/Folder is Exist: " + file.isDirectory());

			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("Last Modified Date is: " + lastModifiedDate);
			System.out.println("Length of the Characters in tghe file" + file.length());
			
		} else {
			
			System.out.println("File not found");
			
		}

	}
}
