 package b;

public class Conditions {
//page 6 exercise 5
	public static void main(String[] args) {

		int n = (int) (Math.random() * 101);
 
		System.out.println(n);

		if (n > 50) {
			System.out.println("Big !");

		} else if (n < 50) {
			System.out.println("Small !");
		} else {
			System.out.println("Bingo !");
		}

		if (n <= 50) {
			System.out.println("Small !");
		} else {
			System.out.println("Big !");
		}

		if (n % 2 == 0) {
			System.out.println("Even !");

		} else {
			System.out.println("Odd !");

		}

	}

}
