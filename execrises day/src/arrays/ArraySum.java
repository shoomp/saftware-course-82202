package arrays;

import java.util.Arrays;

public class ArraySum {

	// page 10
	// exercise 1
	public static void main(String[] args) {

		int[] num = new int[10];

		int sum = 0;

		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.random() * 100);

			sum += num[i];
		}
		System.out.println(Arrays.toString(num));
		System.out.println("the sum is " + sum);
		System.out.println("the avarge is " + sum / num.length);

	}

}
