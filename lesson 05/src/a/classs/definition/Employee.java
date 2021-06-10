package a.classs.definition;

public class Employee extends Person {

	// extend the basic object.
	private double salary;

	public Employee() {

	}

	public Employee(int id, String name, int age, double salary) {

		// call constructor in the super class
		super(id, name, age);
		this.salary = salary;

	}

	public Employee(int id, String name, double salary) {

		// call the constructor in this class
		this(id, name, 0, salary);

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
