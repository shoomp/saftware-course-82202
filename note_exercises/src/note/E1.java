package note;

public class E1 {

	// קלוט מספר וספרה והצג כמה פעמים מופיעה הספרה במספר שהתקבל
	public static void main(String[] args) {

		int x = (int) (Math.random() * 1000000001);
		int dig = (int) (Math.random() * 10);
		int c = 0;

		System.out.println(x + ", " + dig);

		while (x > 0) {
			if (x % 10 == dig) {
				c++;
			}

			x = (int) (x / 10);
		}

		System.out.println(dig + " appears " + c + " times");
	}

}
