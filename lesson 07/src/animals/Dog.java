package animals;

public class Dog extends Mammal implements Swimmer{
	
	public void speak() {
		System.out.println("Dog says _____");
	}

	public void swim() {
		System.out.println("I can swim ~~~");
	}
}
