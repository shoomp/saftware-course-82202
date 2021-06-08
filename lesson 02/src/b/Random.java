package b;

public class Random {
//page 5 exercise 4
	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		int y = (int) (Math.random() + 101);

		System.out.println(x);
		System.out.println(y);
		System.out.println("The sum a+b is = " + (x + y));
		System.out.println(("The both average is = " + (x + y) / 2.0)); // ממוצע
		System.out.println("The reminder from x%10 is = " + (x % 10)); // מודולו
		System.out.println("The reminder from y%10 is = " + (y % 10)); // מודולו
		System.out.println("The area of the ractangle is = " + (x * y)); // שטח

		if (x > y) {
			System.out.println("The bigger value is: " + x);

		} else if (x == y) {
			System.out.println("The both values are same");

		} else {

			System.out.println("The bigger value is  " + y);
		}
	}

}
