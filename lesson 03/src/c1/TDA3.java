package c1;

public class TDA3 {

	public static void main(String[] args) {

		int[][] A = new int[5][];

		A[0] = new int[2];
		A[1] = new int[4];
		A[2] = new int[8];
		A[3] = new int[5];
		A[4] = new int[6];

		array(A);

	}

	public static void array(int[][] print) {

		for (int i = 0; i < print.length; i++) {

			for (int j = 0; j < print[i].length; j++) {

				System.out.print(print[i][j] + " ");

			}
			System.out.println();
		}
	}

}
