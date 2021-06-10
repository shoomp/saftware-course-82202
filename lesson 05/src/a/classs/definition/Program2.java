package a.classs.definition;

public class Program2 {

	public static void main(String[] args) {

		// create a person instance
		Person p = new Person();
		// set the person's state
		p.setId(208487496);
		p.setName("Moriya");
		p.setAge(24);

		// access and print state
		System.out.println("ID: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());

	}

}
