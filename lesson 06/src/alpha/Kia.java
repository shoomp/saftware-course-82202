package alpha;

public class Kia {

	public static void main(String[] args) {

		Car picanto = new Car(88_888_88, "blue");
		picanto.printCar();

		picanto.getLocation().setX(2);
		picanto.getLocation().setY(4);
		picanto.printlocation();

		picanto.getLocation().moveRight(10);
		picanto.getLocation().moveUp(10);
		picanto.printlocation();

		picanto.getLocation().reset();
		picanto.printlocation();

		picanto.setLocation(5, 5);
		picanto.printlocation();

		Car sportage = new Car(11_111_11, "black", 5, 4);
		sportage.printCar();
		sportage.printlocation();
	}

}
