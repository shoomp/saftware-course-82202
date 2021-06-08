package abc;

import java.util.Scanner;

public class FlowControl2 {

	public static void main(String[] args) {

		int password = 123;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter password:  ");
		int input = sc.nextInt();

		System.out.println(input);

		while (password != input) {
			System.out.println("enter password again: ");
			input = sc.nextInt();
		}
		System.out.println("You're logged in");
		sc.close();

	}

}
