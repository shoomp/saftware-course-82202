package arrays;

import java.util.Arrays;

public class OppArr2 {

	public static void main(String[] args) {

		int[] right = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int[] opp = new int[10];

		for (int i = 0; i < right.length; i++) {

			opp[opp.length - i - 1] = right[i];

		}

		System.out.println(Arrays.toString(right));
		System.out.println(Arrays.toString(opp));

	}

}
