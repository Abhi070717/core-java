  package com.rays.exercise;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the number of terms");
			
			int n = scanner.nextInt();
			
			double sum = 0.0;
			
			for (int i = 1; i <= n; i++) {
				
				sum += 1.0/i;
				
				
			}
			
			System.out.println("Harmonic series = " +sum);
		}
		
	}
	

}
