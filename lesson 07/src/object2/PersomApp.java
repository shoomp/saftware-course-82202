package object2;

public class PersomApp {

	public static void main(String[] args) {

		Person p1 = new Person(123456, "Avi", 25); 
		Person p2 = new Person(123456, "Avraham", 29);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println("==============");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println("==============");
		
		System.out.println(p1.equals(p2));
	
	}

}
