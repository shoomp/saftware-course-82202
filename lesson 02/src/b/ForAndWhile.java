package b;

public class ForAndWhile {

	public static void main(String[] args) {

		// page 8
		// exercise 4
		int max = (int) (Math.random() * 51);
		int den = (int) (Math.random() * 11);

		System.out.println("The top is " + max);

		// option 1
		for (int i = 0; i <= max; i += den) {

			System.out.print(i + ", ");
		}

		System.out.println();

		// option 2
		for (int i = 0; i <= max; i++) {

			if (i % den == 0) {

				System.out.print(i + ", ");
			}

		}

	}

}
