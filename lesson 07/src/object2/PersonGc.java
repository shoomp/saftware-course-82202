package object2;

public class PersonGc {

	public static void main(String[] args) {
		
		Person p1 = new Person(123456, "Avi", 25);
		
		System.out.println(p1.toString());
		
		p1 = null;
		
		System.gc();

	}

}
