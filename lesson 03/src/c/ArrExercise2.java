package c;

import java.util.Arrays;
import java.util.Scanner;

public class ArrExercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arr = new String[5];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("enter name: ");

			arr[i] = sc.nextLine();

		}

		System.out.println("The names are: " + Arrays.toString(arr));
		sc.close();
	}

}
