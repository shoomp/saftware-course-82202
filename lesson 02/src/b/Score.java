package b;

public class Score {

	public static void main(String[] args) {

		int gr = (int) (Math.random() * 11);

		System.out.println(gr);

		if (gr < 6) {
			System.out.println("failed");

		} else if (gr == 6) {
			System.out.println("pass");

		} else if (gr <= 9) {
			System.out.println("good");

		} else {
			System.out.println("excelent!");
		}
	}

}
