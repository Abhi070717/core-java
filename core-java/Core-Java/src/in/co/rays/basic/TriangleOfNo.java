package in.co.rays.basic;

public class TriangleOfNo {
	public static void main(String[] args) {
		for(int i = 0; i<=4; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
