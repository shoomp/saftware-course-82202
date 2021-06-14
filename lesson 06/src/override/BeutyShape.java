package override;

public class BeutyShape {

	public static void main(String[] args) {

		Shape shape;

		shape = new Circle(2, "lilac");
		System.out.print("The " + shape.getColor() + " shape area: ");
		System.out.println(shape.getArea());

		shape = new Rectangle(3, 5, "navy");
		System.out.print("The " + shape.getColor() + " shape area: ");
		System.out.println(shape.getArea());
	}

}
