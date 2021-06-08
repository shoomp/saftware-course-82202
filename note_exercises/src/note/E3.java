package note;

public class E3 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 10001);
		int y = x;
		int z = 0;

		while (x != 0) {

			z = z * 10;
			z += x % 10;
			x = (int) (x / 10);
		}

		if (z == y) {

			System.out.println(z + ", " + y);
			System.out.println("Plindrom");
		} else {

			System.out.println(z + ", " + y);
			System.out.println("Not plindrom");
		}

	}

}
