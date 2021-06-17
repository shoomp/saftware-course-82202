package stat;

public class Car {
	
	private static int counter;
	private final int number;
	private int speed;
	public static final int MAX_SPEED = 120;
	
	static {//initializer
		System.out.println("car class loaded");
	}
	
	
	{//initializer
		counter++;
		this.number = counter;
	}
	
	public Car() {
	}

	public Car(int speed) {
		super();
		if(speed<= MAX_SPEED) {
		this.speed = speed;
		}
	}

	public int getNumber() {
		return number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}

	
	
	
	

}
