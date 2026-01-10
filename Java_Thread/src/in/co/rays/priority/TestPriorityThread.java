package in.co.rays.priority;

public class TestPriorityThread {
	
	public static void main(String[] args) {
		
		PriorityThread t1 =new PriorityThread("Abhi");
		PriorityThread t2 =new PriorityThread("Bhawsar");
		
		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();
		t2.start();
		
	}

}
