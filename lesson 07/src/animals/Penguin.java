package animals;

public class Penguin extends Mammal implements AdvanceFlyer {

	@Override
	public void speak() {
		System.out.println("Penguin says _____");
	}

	@Override
	public void fly() {
		System.out.println("I can fly ,;'");
	}

	@Override
	public void Jump() {
		System.out.println("I'm jumping up ^^^");
		
	}
	@Override
	public void land() {
		System.out.println("I'm landind down //");
		
	}
	@Override
	public void swim() {
		System.out.println("I can swim ~~~");
	}
	
}
