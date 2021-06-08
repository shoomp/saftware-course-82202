package arrays;

import java.util.Arrays;

public class DemoArr1 {

	public static void main(String[] args) {

		// create an array of 10 byte elements
		byte[] arr1 = new byte[10];

		arr1[0] = 2;
		arr1[5] = 3;
		arr1[9] = 5;
		System.out.println(Arrays.toString(arr1));

		// create an array of 3 string elements
		// static initialization
		String[] arr2 = { "111", "222", "333" };
		// print array as string
		System.out.println(Arrays.toString(arr2));
		// print array elements
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		// create an array of 3 character elements
		char[] arr3 = { 'A', 'B', 'C', ' ', '"', '\n', '\\', 65 };
		System.out.println(Arrays.toString(arr3));

		// copy initialization
		int[] arr5 = { 2, 4, 6 };

		int[] arr51 = new int[arr5.length + 2];

		/** copy the arr5 into arr51 */
		System.arraycopy(arr5, 0, arr51, 0, arr5.length);

		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr51));

		// replace the first array by the second array
		arr5 = arr51;
		arr51[3] = 8;
		arr51[4] = 10;
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr51));
	}

}
