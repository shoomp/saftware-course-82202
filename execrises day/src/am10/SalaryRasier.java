package am10;

public class SalaryRasier {

	public static void main(String[] args) {

		int salary = (int) ((Math.random() + 5) * 1000);
		System.out.println(salary);

		if (1.1 * salary < 6000) {
			salary *= 1.1;
		}
		System.out.println(salary);
	}

}
