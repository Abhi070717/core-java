package in.co.rays.basic;

public class SwitchCaseWeek {
	public static void main(String[] args) {
		String day = "Weekday";
		switch (day){
		case "Monday":
			System.out.println("First day of week");
			break;
		case "Tuesday":
			System.out.println("Second day of week");
			break;
		case "Wednesday":
			System.out.println("Third day of week");
			break;
		case "Thursday":
			System.out.println("Forth day of week");
			break;
		case "Friday":
			System.out.println("Fivth day of week");
			break;
		case "Saturday":
			System.out.println("Sixth day of week");
			break;
			default:
				System.out.println("Seventh day is sunday");
		}
	}

}
