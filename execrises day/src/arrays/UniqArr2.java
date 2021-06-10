package arrays;

import java.util.Arrays;

public class UniqArr2 {

	public static void main(String[] args) {

		int[] input = { 1, 1, 2, 3, 2, 4, 10, 5, 5, 7 };
		int[] output = new int[10];
		int c = 0;

		counter: for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < i; j++) {

				if (input[i] == input[j]) {

					continue counter;
				}
			}

			output[c] = input[i];
			c++;

		}

		int[] cor = new int[c];

		System.arraycopy(output, 0, cor, 0, c);
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
		System.out.println(Arrays.toString(cor));

	}

}
