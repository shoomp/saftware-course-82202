package note;

public class E6 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 101);

		while (a >= 0) {
			int s = 0;
			int t = a;

			while (t > 0) {
				s += t % 10;
				t = t / 10;
			}
			System.out.println(s);

			a = (int) (Math.random() * 101);

		}

		int b;

		do {
			b = (int) (Math.random() * 101);
			int s = 0;
			int t = b;

			while (t > 0) {
				s += t % 10;
				t = t / 10;
			}
			System.out.println(s);

		} while (b >= 0);

	}

}
