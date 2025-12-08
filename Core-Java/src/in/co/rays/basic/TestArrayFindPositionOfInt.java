package in.co.rays.basic;

public class TestArrayFindPositionOfInt {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 7, 8 };

		int n = 87;
		int position = -1;

		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				position = i;

				System.out.println("Element is = " + n + " index is = " + position);                   
			}

		}
		
		if (position == -1) {

			System.out.println("Element is = " + n + " index is = " + position);                   
		}

	}
}
