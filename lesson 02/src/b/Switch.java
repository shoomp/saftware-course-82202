package b;

public class Switch {

	public static void main(String[] args) {

		int day = (int) (Math.random() * 10) + 1;
		
		switch (day) {

		case 1:
			System.out.println("Sunday");
break;
		case 2:
			System.out.println("Monday");
break;
		case 3:
			System.out.println("Thuesday");
break;
		case 4:
			System.out.println("Wednesday");
break;
		case 5:
			System.out.println("Thursday");
break;
		case 6:
			System.out.println("Friay");
break;
		case 7:
			System.out.println("Saturday");
break;
		default:
			System.out.println(day + " It's not a valid day value.");
			
		}
	}

}
