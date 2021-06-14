package override;

public class ArrShp {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];

		shapes[0] = new Rectangle(4, 5, "red");
		shapes[1] = new Circle(5, "white");
		shapes[2] = new Rectangle(4, 5, "blue");
		shapes[3] = new Shape("pink");
		shapes[4] = new Rectangle(4, 5, "white");

		for (int i = 0; i < shapes.length; i++) {
			Shape s = shapes[i];
			System.out.println("color: " + s.getColor() + ", area: " + s.getArea());

			// is the current shape is circle
			// instance-of operator
			if (s instanceof Circle) {

				System.out.println("This is a circle");
				Circle c = (Circle) s;
				System.out.println("Radius = " + c.getR());
			}
			System.out.println("===============");
		}

	}

}
