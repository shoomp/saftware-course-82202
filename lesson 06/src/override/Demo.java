package override;

public class Demo {

	public static void main(String[] args) {

		Object obj = new Circle(5, "pink");
		Shape shape = (Shape) obj;

		shape.getArea();
		shape.getColor();
		shape.setColor(null);

		Rectangle rect = (Rectangle) obj;
		rect.getArea();
		rect.getColor();
		rect.setColor(null);

		Circle circle = (Circle) obj;
		circle.getArea();
		circle.getR();
		circle.setR(0);
		circle.getColor();
		circle.setColor(null);

	}

}
