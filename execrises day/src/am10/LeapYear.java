package am10;

public class LeapYear {

	public static void main(String[] args) {

		int y = (int) (Math.random() * 2022);

		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {

			System.out.println(y + " is a leap year.");

		} else {
			System.out.println(y + " isn't a leap year.");
		}
	}

}
