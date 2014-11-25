public class _3_TestGeometricObject1 {
	/** Main method */
	public static void main(String[] args) {
		// Declare and initialize two geometric objects
		_3_GeometricObject geoObject1 = new _3_Circle(5);
		_3_GeometricObject geoObject2 = new _3_Rectangle(5, 3);

		System.out.println("The two objects have the same area? "
				+ equalArea(geoObject1, geoObject2));

		// Display circle
		displayGeometricObject(geoObject1);

		// Display rectangle
		displayGeometricObject(geoObject2);
	}

	/** A method for comparing the areas of two geometric objects */
	public static boolean equalArea(_3_GeometricObject object1,
			_3_GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}

	/** A method for displaying a geometric object */
	public static void displayGeometricObject(_3_GeometricObject object) {
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
}
