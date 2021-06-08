package c1;

import java.util.Scanner;

public class TDA2 {

	public static void main(String[] args) {

		char[][] seats = new char[4][3];

		seats[1][0] = 'x';
		seats[1][2] = 'x';
		seats[3][2] = 'x';
		seats[3][1] = 'x';
		seats[3][2] = 'x';

		Scanner sc = new Scanner(System.in);
		value(seats);
		int x;
		int y;

		choice: while (check(seats)) { // must change****

			print(seats);

			System.out.println("enter line between 0-4: ");
			x = sc.nextInt();
			System.out.println("enter seat between 0-9: ");
			y = sc.nextInt();

			while (seats[x][y] == 'x') {

				System.out.println("This seat isn't available, ");
				System.out.println("enter line between 0-4: ");
				x = sc.nextInt();
				System.out.println("enter seat between 0-9: ");
				y = sc.nextInt();

			}

			System.out.println("line " + x + " seat " + y + " is available");
			seats[x][y] = 'x';

			System.out.println();

		}
		
		
		
		System.out.println("there is no room");
		sc.close();
	}

	public static void print(char[][] print) {

		System.out.println("        0, 1, 2, 3, 4, 5, 6, 7, 8, 9 \n");

		for (int i = 0; i < print.length; i++) {

			System.out.print("line " + i + ": ");

			for (int j = 0; j < print[i].length; j++) {

				System.out.print(print[i][j] + " ");

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
}
