package A;

import java.util.Scanner;

public class ScannerM {

	public static void main(String[] args) {

		// how to get input from user
		// create a scanner object
		Scanner sc = new Scanner(System.in);

		System.out.print("enter min: ");
		int a = sc.nextInt(); // input operation
		System.out.print("enter max: ");
		int b = sc.nextInt(); // input operation

		sc.close(); // close the scanner object

		System.out.println("range: " + a + " - " + b);
		
		int r = (int) (Math.random()*(b - a +1)) + a;
		System.out.println(r);
		

	}

}
