package loops;

public class Factorial {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 10);
		int y = 1;

		for (int i = 2; i <= x; i++) {

			y *= i;

		}

		System.out.println("The factorail of " + x + " is " + y);
	}

}
