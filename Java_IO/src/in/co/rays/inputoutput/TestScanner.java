package in.co.rays.inputoutput;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int intValue;																//Store Integer Value
		System.out.println("Write integer value: ");
		intValue = scan.nextInt();
		System.out.println("Integer: " + intValue);
		
		float floatValue;															//Store Float Value
		System.out.println("Write Float Value- ");
		floatValue = scan.nextFloat();
		System.out.println("Float: " + floatValue);
		
		double doubleValue;															//Store Double Value
		System.out.println("Write Double Value- ");
		doubleValue = scan.nextDouble();
		System.out.println("Double: " + doubleValue);
		
		scan.nextLine(); 														//Buffer Clear
		
		String lineValue;															//Store String line Value
		System.out.println("Write String Line-");
		lineValue = scan.nextLine();
		System.out.println("String Line: " + lineValue);
		
		String wordValue;															//Store String Word Value
		System.out.println("Write String Word- ");
		wordValue = scan.next();
		System.out.println("String Word: " + wordValue);
		
		scan.close();
	}

}
