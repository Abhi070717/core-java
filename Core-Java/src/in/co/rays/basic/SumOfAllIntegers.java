package in.co.rays.basic;

public class SumOfAllIntegers {
	public static void main(String[] args) {	
	for(int i = 101; i < 200; i++) {
		if(i % 7 == 0) {
			System.out.println("Divisible By 7 " + i);
		}else
			System.out.println("Not Divisible By 7 " + i);
	}
		
	}

}