package a.classs.definition;

public class Program4 {

	public static void main(String[] args) {

		Employee e = new Employee();

		e.setName("Rina");
		System.out.println(e.getName());
		System.out.println("is employeed for ");
		e.setSalary(15_000);
		System.out.println(e.getSalary());

	}

}
