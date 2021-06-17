package stat;

public class CarApp {

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car(450);
		Car c4 = new Car();
		Car c5 = new Car(310);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println(Car.getCounter());
		
		
	}

}
