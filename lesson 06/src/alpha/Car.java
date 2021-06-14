package alpha;

public class Car {

	private int number;
	private String color;
	private Point location;

	public Car() {
	}

	public Car(int number, String color, int x, int y) {
		super();
		this.number = number;
		this.color = color;
		this.location = new Point(x, y);
	}

	public Car(int number, String color) {
		super();
		this.number = number;
		this.color = color;
		this.location = new Point();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public void setLocation(int x, int y) {
		this.location = new Point(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Point getLocation() {
		return location;
	}

	public void printlocation() {
		System.out.print("the car " + number + " is at: ");
		location.print();
	}

	public void printCar() {
		System.out.println("Car: " + number);
		System.out.println("color: " + color);
	}
}
