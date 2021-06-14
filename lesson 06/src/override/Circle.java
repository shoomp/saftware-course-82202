package override;

public class Circle extends Shape {

	private int r;

	public Circle(int r, String color) {

		super(color);
		this.r = r;

	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return Math.pow(r, 2) * Math.PI;

	}

}
