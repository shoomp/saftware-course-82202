package b;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter mode: [on, off, stand-by]");
		String machineMode = sc.nextLine();

		switch (machineMode) {

		case "on":
			System.out.println("The machine is working.");
			break;
		case "off":
			System.out.println("The machine is NOT working.");
			break;
		case "stand-by":
			System.out.println("Stand-by");
			break;
		default:
			System.out.println("The mode " + machineMode + " is not valid.");

			sc.close();
		}
	}

}
