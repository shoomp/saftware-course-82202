package arrays;

import java.util.Arrays;

public class OppArr {

	public static void main(String[] args) {

		int[] right = new int[10];
		int[] opp = new int[10];

		for (int i = 0; i < right.length; i++) {

			right[i] = (int) (Math.random() * 11);
			opp[opp.length - i - 1] = right[i];

		}

		System.out.println(Arrays.toString(right));
		System.out.println(Arrays.toString(opp));
	}

}
