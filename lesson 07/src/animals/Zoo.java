package animals;

public class Zoo {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];

		animals[0] = new Dog();
		animals[1] = new Butterfly();
		animals[2] = new Ostrich();
		animals[3] = new Hawk();
		animals[4] = new Bat();
		animals[5] = new Ant();
		animals[6] = new Penguin();
		animals[7] = new Dog();
		animals[8] = new Ostrich();
		animals[9] = new Ant();

		for (Animal a : animals) {
			if (a != null) {
				a.speak();
				if (a instanceof Dog) {
					System.out.println("Warning!");
				}
				if (a instanceof Flyer) {
					((Flyer) a).fly();
				}
				if (a instanceof Swimmer) {
					((Swimmer) a).swim();
				}
				if (a instanceof AdvanceFlyer) {
					((AdvanceFlyer) a).Jump();
					((AdvanceFlyer) a).land();
				}
			}
			System.out.println();
		}

	}

}
