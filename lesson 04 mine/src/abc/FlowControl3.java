package abc;

import java.util.Scanner;

public class FlowControl3 {

	public static void main(String[] args) {

		int password = 123;

		Scanner sc = new Scanner(System.in);

		int input = 0;

		// do-while loop
		do {
			System.out.println("enter password: ");
			input = sc.nextInt();
		} while (password != input);

		System.out.println("You're logged in");
		sc.close();

	}

}
