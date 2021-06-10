package a.classs.definition;

public class Program {

	public static void main(String[] args) {

		System.out.println("=== start");

		Person p1 = new Person();
		p1.setName("dor");
		p1.speak();

		// print the person age
		System.out.println("Age " + p1.getAge());

		// set the person age and print again
		p1.setAge(52);

		System.out.println("Age " + p1.getAge());

		p1.setAge(5252);
		System.out.println("Age " + p1.getAge());

		System.out.println("=== stop");

	}

}
