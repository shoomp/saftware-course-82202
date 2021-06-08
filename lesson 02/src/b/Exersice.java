package b;

public class Exersice { // page 8

	public static void main(String[] args) {

		// exercise 1
		int x = (int) (Math.random() * 11);
		System.out.println(x);

		for (int i = 1; i <= x; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();

		// exercise 2
		int y = (int) (Math.random() * 11) + 10;
		System.out.println(x + ", " + y);

		System.out.println("The top is " + y);

		for (int i = x; i <= y; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();

		// exercise 3
		// option 1
		for (int i = 0; i <= y; i++) {

			if (i % 2 == 0) {

				System.out.print(i + ", ");
			}
		}

		// option 2
		for (int i = 0; i <= y; i++) {

			System.out.print(i + ", ");
		}
	}

}
