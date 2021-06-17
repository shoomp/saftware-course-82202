package wrap;

public class WrapperClass {

	public static void main(String[] args) {

		int x = 5;
		Integer y = x;
		
		System.out.println(y.toString());
		
		
		printAnyObj(x);
		printAnyObj(y);
		
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    static void printAnyObj(Object obj) {
		System.out.println(obj);
		
	}
	
}
