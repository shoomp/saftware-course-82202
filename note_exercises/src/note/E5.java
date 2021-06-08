package note;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int x = (int) (Math.random() * 101);
		System.out.print("enter max: ");
		int max = sc.nextInt(); // input operation

		int snd = 0;
		int im = 1;
		int is = 0;

		System.out.println(max);

		for (int i = 2; i <= 5; i++) {

			int n = sc.nextInt();

			if (n > max) {

				snd = max;
				max = n;
				is = im;
				im = i;

			} else if (n != max && n >= snd || snd == 0 || max == snd) {

				snd = n;
				is = i;
			}

		}

		if (snd != max) {

			System.out.println("The second value is " + snd + " index - " + is);
		} else {

			System.out.println("The is no second value");

		}
		sc.close();

	}

}
