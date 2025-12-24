package in.co.rays.basic;

public class TestArraySmallestNo {
	public static void main(String[] args) {
		int[] a = { 5, 10, 15, 20, 255, 3 };

		int SmallestNo = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < SmallestNo) {
				SmallestNo = a[i];
			}

		}
		System.out.println("SmallestNo is: " + SmallestNo);

	}

}
