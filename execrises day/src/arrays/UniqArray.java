package arrays;

import java.util.Arrays;

public class UniqArray {

	public static void main(String[] args) {

		int[] input = new int[10];
		int[] output = new int[10];
		int c = 0;

		counter: for (int i = 0; i < input.length; i++) {

			input[i] = (int) (Math.random() * 11);

			for (int j = 0; j < i; j++) {

				if (input[i] == input[j]) {

					continue counter;
				}
			}

			output[c] = input[i];
			c++;

		}

		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));

	}

}
