package override;

public class newShape {

	public static void main(String[] args) {

		Shape s = new Shape("yellow");
		System.out.print("The " + s.getColor() + " shape area: ");
		System.out.println(s.getArea());
		System.out.println();

		Rectangle rc = new Rectangle(4, 5, "pink");
		System.out.print("The " + rc.getColor() + " rectangle area is : ");
		System.out.println(rc.getArea());

		System.out.println();
		int p = (int) (Math.random() * 10) + 1;
		Circle c = new Circle(p, "gold");

		System.out.println("Radius =" + p);
		System.out.print("The " + c.getColor() + " circle area is: ");
		System.out.println(c.getArea());

	}

}
