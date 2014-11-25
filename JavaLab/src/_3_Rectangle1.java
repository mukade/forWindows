public class _3_Rectangle1 extends _3_GeometricObject1 {
	private double width;
	private double height;

	public _3_Rectangle1() {
	}

	public _3_Rectangle1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public _3_Rectangle1(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}

	/** Return area */
	public double getArea() {
		return width * height;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
