package in.co.rays.basic;

public class TestArrayLargestNoInArray {
	public static void main(String[] args) {
		int[] a = { 5, 10, 15, 20, 255, 30 };

		int largestNo = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largestNo) {
				largestNo = a[i];
			}

		}
		System.out.println("largestNo is: " + largestNo);

		int secondLargest = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < largestNo && a[i] > secondLargest) {
				secondLargest = a[i];
			}

		}
		
		System.out.println("second largest: " + secondLargest);

	}

}
/*
 * Output : 
 * largestNo is: 255 second largest: 30
 */