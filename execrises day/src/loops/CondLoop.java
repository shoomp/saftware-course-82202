package loops;

public class CondLoop {

	public static void main(String[] args) {

		int def = (int) (Math.random() * 10000) + 1;

		System.out.println(def);
		int dcount = 0;
		int d = def;
		int dsum = 0;
		int opdef = 0;

		// number of digits
		// the digits sum
		// the opposite number

		while (d != 0) {

			opdef = opdef * 10 + d % 10;
			dcount++;
			d = d / 10;
			dsum += d % 10;
		}
		System.out.println("The number contains " + dcount + " digits");
		System.out.println("The digits sum is  " + dsum);
		System.out.println("The opposite number is  " + opdef);

		// the first left digit
		int t = def;
		int dleft = t;

		while (t > 9) {
			t = t / 10;
			dleft = t % 10;
		}
		System.out.println("The leftest digit is " + dleft);

	}

}
