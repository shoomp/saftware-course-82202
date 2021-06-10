package am10;

public class Cond {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		int z = (int) (Math.random() * 10);
		int t;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		if (x > y) {
			if (x < z) {
				t = z;
				z = y;
				y = x;
				x = t;

			} else if (y < z) {
				t = z;
				z = y;
				y = t;
			}

		} else if (x < z) {
			t = x;
			x = y;
			y = z;
			z = t;
		} else if (y < z) {
			t = z;
			z = y;
			y = t;
		} else {
			t = y;
			y = x;
			x = t;
		}
		System.out.print("The bigggest value is " + x);

	}

}
