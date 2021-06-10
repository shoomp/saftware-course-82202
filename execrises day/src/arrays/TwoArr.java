package arrays;

public class TwoArr {

	public static void main(String[] args) {

		int[][] clas = new int[5][5];

		for (int i = 0; i < clas.length; i++) {
			for (int j = 0; j < clas[i].length; j++) {

				clas[i][j] = (int) (Math.random() * 100);

			}

		}

	}

}
