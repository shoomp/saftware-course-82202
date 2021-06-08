package b;

public class ForLoop {

	public static void main(String[] args) {
		
		//print 10 stars
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		
		System.out.println("\n");
		
		//print 5 line of 10 stars
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
