package in.co.rays.basic;

public class TestArraySecondLagrestNo {
	package in.co.rays.basic;

	public class TestArraySecondLargest {
	    public static void main(String[] args) {
	        int[] a = { 5, 10, 15, 20, 255, 30 };

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : a) {
	            if (num > largest) {
	                secondLargest = largest; // update second largest
	                largest = num;           // update largest
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        System.out.println("Largest number: " + largest);
	        System.out.println("Second largest number: " + secondLargest);
	    }
	}


}
