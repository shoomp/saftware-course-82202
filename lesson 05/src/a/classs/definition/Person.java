package a.classs.definition;

public class Person {

	protected int id;
	protected String name;
	protected int age;

	// constructor 1
	public Person() {

	}

	// constructor 1
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		setAge(age);
	}

	/**
	 * change the value of the age if the value is valid
	 *
	 * @author îåøéä äãàéä
	 */
	public void setAge(int age) {

		// the keyword 'this' is reference to the current object.
		if (age >= 0 && age <= 120) {

			this.age = age;
		}

	}

	/**
	 * return the age of this person
	 * 
	 * @author îåøéä äãàéä
	 */

	public int getAge() {
		return this.age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println(name + " says: bla bla");
	}

	public void walk() {
		System.out.println(name + " is walking");
	}

}
