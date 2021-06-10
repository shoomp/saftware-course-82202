package am10;

public class SalaryCalculator {

	public static void main(String[] args) {

		int sal = (int) (Math.random() * 100000);

		System.out.println(sal);
		int sal1 = sal;
		float charge = 0;
		int[] tax = { 0, 23000, 50000, 100000, 1000000 };
		double pri = 0.1;

		for (int i = 0; i < tax.length; i++) {

			if (sal > tax[i + 1]) {

				sal1 = tax[i + 1] - tax[i];
				charge += (sal1 * pri);
				pri += 0.1;

			} else {

				charge += (sal - tax[i]) * pri;
				break;
			}

		}
		System.out.println("you need to pay " + charge + " for tax.");

	}

}
