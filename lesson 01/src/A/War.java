package A;

public class War {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 13) + 1;
		int y = (int) (Math.random() * 13) + 1;

		if (x > y) {
			System.out.println("The winner is Player A" + "\n" + x + " , " + y);
		} else if (x == y) {
			System.out.println("Both players" + ": " + x + " , " + y);
		} else {
			System.out.println("The winner is Player B" + "\n " + x + " , " + y);
		}
	}

}
