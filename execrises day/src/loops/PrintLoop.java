package loops;

public class PrintLoop {

	public static void main(String[] args) {

		// exercise 1
		int x = (int) (Math.random() * 10) + 1;

		for (int i = 1; i < x; i++) {
			System.out.print(i + ", ");
		}
		System.out.println(x);

		// exercise 2
		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);

		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}

		for (int i = b; i < a; i++) {
			System.out.print(i + ", ");
		}
		System.out.println(a);

		// exercise 3
		int n = (int) (Math.random() * 10) + 1;

		for (int i = 0; i <= n; i += 2) {
			System.out.print(i + " ");

		}
		System.out.println();

		// exercise 3
		int m = (int) (Math.random() * 100) + 1;
		int d = (int) (Math.random() * 9) + 1;

		System.out.println(m + ", " + d);

		for (int i = 0; i <= m; i++) {

			if (i % d == 0) {
				System.out.print(i + " ");

			}
		}

	}

}
