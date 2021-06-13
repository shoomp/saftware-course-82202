package arrays;

import java.util.Arrays;

/**
 * 
 * This method create a class with 20 students and 10 grade for each of them.
 *
 * @author מוריה הדאיה
 * 
 */
public class TwoArr {

	public static void main(String[] args) {

		int[][] clas = new int[20][10];

		double sum = 0;
		double Csum = 0;

		/**
		 * calculate the average of the grades of each student.
		 * 
		 */
		for (int i = 0; i < clas.length; i++) {
			for (int j = 0; j < clas[i].length; j++) {

				clas[i][j] = (int) (Math.random() * 100);
				sum += clas[i][j];

			}

			sum /= 10;
			Csum += sum;
			System.out.print("Sdudent " + (i + 1) + " - ");
			System.out.print(Arrays.toString(clas[i]));
			System.out.println(" - the average is " + sum);
			sum = 0;
		}

		/**
		 * print the collective average
		 * 
		 */
		Csum /= 20;
		System.out.println();
		System.out.println("The collective average is " + Csum);

	}

}
