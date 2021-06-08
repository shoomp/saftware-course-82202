package b;

public class Boom7 {

	/*
	 * print all value from 0 to x that divided 7 or contain the digit 7 and print
	 * also "boom" for each one
	 */

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		int y;

		System.out.println(x);

		lbl: for (int i = 0; i <= x; i++) {

			if (i % 7 == 0) {
				System.out.println(" Boom ");
				continue;
			}
			y = i;

			while (y != 0) {

				if (y % 10 == 7) {

					System.out.println(" Boom ");
					continue lbl;
				}
				y = (int) (y / 10);
			}

			System.out.print(i + ", ");
		}

	}
}
