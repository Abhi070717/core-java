package in.co.rays.threads;

public class TestHiThread {
	
	public static void main(String[] args) throws Exception {
		
		Thread t1 = new HiThread("Abhi");
		Thread t2 = new HiThread("Bhawsar");
		
		t1.start();
		t2.start();
		
		for(int i = 1; i<=10; i++) {					//Main Thread
			System.out.println(i + "main thread");
		}
	}

}
