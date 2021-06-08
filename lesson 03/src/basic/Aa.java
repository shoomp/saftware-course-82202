package basic;

import java.util.Arrays;

public class Aa {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8 };
		int[] arr2 = new int[arr.length];

		System.arraycopy(arr, 0, arr2, 0, arr.length);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}

}
