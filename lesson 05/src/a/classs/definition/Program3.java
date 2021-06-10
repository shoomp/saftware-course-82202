package a.classs.definition;

public class Program3 {

	public static void main(String[] args) {

		// create a person instance using the 1st constructor
		Person p = new Person();

		// create a person instance using the 2nd constructor
		Person p2 = new Person(208487496, "Moriya", 24);

		// access and print state
		System.out.println("ID: " + p2.getId());
		System.out.println("Name: " + p2.getName());
		System.out.println("Age: " + p2.getAge());

		System.out.println("======");

		System.out.println("ID: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
	}

}
