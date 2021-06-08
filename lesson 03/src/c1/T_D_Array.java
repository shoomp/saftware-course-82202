package c1;

import java.util.Arrays;

public class T_D_Array {

	public static void main(String[] args) {

		int[][] matrix = new int[4][10];

		matrix[2][2] = 5;

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				matrix[i][j] = (int) (Math.random() * 11);

			}

			System.out.println(Arrays.toString(matrix[i]));

		}

	}

}
