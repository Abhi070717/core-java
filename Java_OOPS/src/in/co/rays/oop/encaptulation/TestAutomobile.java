package in.co.rays.oop.encaptulation;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile Car1 = new Automobile();
		
		Car1.setColor("Green");
		Car1.setMake("swift");
		Car1.setSpeed(250);
		
		
		System.out.println("Car Color: "+ Car1.getColor());
		System.out.println("Car Build Model: " + Car1.getMake());
		System.out.println("Car Maximum Speed: "+Car1.getSpeed());
		Car1.brake(40);
		Car1.changeGear(2);
		Car1.acceletor(40);
	}

}
