package alpha;

public class NewPoint {
	public static void main(String[] args) {

		Point a = new Point();

		a.setX(5);
		a.setY(7);

		Point b = new Point(2, 4);
		Point c = new Point(4);

		a.print();
		b.print();
		c.print();

		a.moveDown();
		a.moveLeft();

		a.print();

		b.moveRight(20);
		b.moveUp(10);

		b.print();

		c.reset();
		c.print();
	}

}
