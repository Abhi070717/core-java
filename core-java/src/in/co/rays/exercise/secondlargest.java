package com.rays.exercise;

public class secondlargest {
	public static void main(String[] args) {
int[] arr = {120,10,100,45,67,109};
		
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>max) {
				
				min = max;
				max = arr[i];
				
			}
			
			if(max>arr[i] && min<arr[i]) {
				
				min = arr[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);	}
		
	}


