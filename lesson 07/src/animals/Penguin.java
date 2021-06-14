package animals;


public class Penguin extends Mammal implements Flyer, Swimmer{


	public void speak() {
		System.out.println("Penguin says _____");
		
		 }
	public void fly() {
		
		System.out.println("I can fly ,;'");
		
	}
	
	public void swim() {
		System.out.println("I can swim ~~~");
	}
}
