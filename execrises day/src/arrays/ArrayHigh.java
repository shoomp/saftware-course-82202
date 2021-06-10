package arrays;

public class ArrayHigh {

	// page 10
	// exercise 2
	public static void main(String[] args) {

		int[] high = new int[50];

		int max = 0;
		int imax = 0;
		for (int i = 0; i < high.length; i++) {

			high[i] = (int) (Math.random() * 101);

			if (high[i] > max) {

				max = high[i];
				imax = i;
			}

		}
		System.out.print("the highest value is " + max);
		System.out.println(" and its index is " + imax);

	}

}
