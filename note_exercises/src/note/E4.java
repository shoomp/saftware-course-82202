package note;

import java.util.Scanner;

public class E4 {

	// find the second value from 100 numbers
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int x = (int) (Math.random() * 101);
		System.out.print("enter max: ");
		int x = sc.nextInt(); // input operation

		int max = x;

		System.out.println(x);

		for (int i = 2; i <= 5; i++) {

			int n = sc.nextInt();

			if (n > max) {

				x = max;
				max = n;
			} else if (x == max || n > x && n != max) {
				x = n;
			}

		}

		if (x != max) {

			System.out.println("The second value is " + x);
		} else {

			System.out.println("The is no second value");

		}
		sc.close();
	}

}
