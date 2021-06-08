package abc;

public class FlowControl {

	public static void main(String[] args) {

		// if construct
		int x = 10;
		if (x == 10) {

			System.out.println("Ten");
		} else {

			System.out.println("Some ather value");
		}

		// switch construct
		switch (x) {
		case 10:
			System.out.println("Ten");
			break;
		case 20:
			System.out.println("Twenty");
			break;
		default:
			System.out.println("Default");

		}

		// loops
		// while loop
		int c = 10;

		while (c <= 15) {
			System.out.print("*");
			c++;
		}

		// for loop
		for (int i = 0; i <= 5; i++) {

			System.out.print("+");
		}

		// for-each loop
		String[] arr = { "***", "+++", "///" };

		for (String e : arr) {
			System.out.println(e);
		}

	}

}
