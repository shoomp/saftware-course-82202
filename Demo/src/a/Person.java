package a;

public  abstract class Person {
	
	private final int id;
	private String name;
	private int age;
	Adress adress = new Adress(null, null, 0);
	
	public Person(int id) {
		this.id =id;
		
	}
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(int id, String name, int age, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.adress = adress;
		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	
}
