package c1;

import java.util.Scanner;

public class TDA2E {

	public static void main(String[] args) {

		char[][] seats = new char[3][3];

		seats[1][0] = 'x';
		seats[1][1] = 'x';
		seats[0][1] = 'x';
		seats[2][1] = 'x';
		seats[2][2] = 'x';
		seats[1][2] = 'x';
		seats[0][1] = 'x';

		Scanner sc = new Scanner(System.in);
		value(seats);
		int c = 0;

		choice: while (check(seats)) { // must change****

			print(seats);
			replace(seats);

			System.out.println("Do you want to ticket another seat? ");
			System.out.println("(for 'yes' enter 1, for 'no' enter 2)");
			c = sc.nextInt();

			if (c == 2) {
				break choice;
			}

		}
		if (c == 1) {

			System.out.println("there is no room");
		}
		sc.close();
	}

	public static void print(char[][] print) {

		System.out.println("        0  1  2  \n");

		for (int i = 0; i < print.length; i++) {

			System.out.print("line " + i + ": ");

			for (int j = 0; j < print[i].length; j++) {

				System.out.print(print[i][j] + "  ");

			}
			System.out.println();
		}
	}

	public static void value(char[][] cinema) {

		for (int i = 0; i < cinema.length; i++) {

			for (int j = 0; j < cinema[i].length; j++) {

				if (cinema[i][j] != 'x') {

					cinema[i][j] = '0';
				}

			}
		}
	}

	public static boolean check(char[][] room) {

		boolean place = false;

		lines: for (int i = 0; i < room.length; i++) {

			for (int j = 0; j < room[i].length; j++) {

				if (room[i][j] == '0') {
					place = true;
					break lines;
				}

			}
			place = false;

		}
		return place;
	}

	public static void replace(char[][] movie) {

		Scanner scn = new Scanner(System.in);

		System.out.println();
		System.out.println("enter line between 0-2: ");
		int x = scn.nextInt();
		System.out.println("enter seat between 0-2: ");
		int y = scn.nextInt();

		while (movie[x][y] == 'x') {

			System.out.println("This seat isn't available, ");
			System.out.println("enter line between 0-2: ");
			x = scn.nextInt();
			System.out.println("enter seat between 0-2: ");
			y = scn.nextInt();

		}

		System.out.println("line " + x + " seat " + y + " is available");
		movie[x][y] = 'x';

		System.out.println();

	}
}
