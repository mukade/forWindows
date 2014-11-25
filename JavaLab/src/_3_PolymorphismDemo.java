public class _3_PolymorphismDemo {
	/** Main method */
	public static void main(String[] args) {
		// Display circle and rectangle properties
		displayObject(new _3_Circle4(1, "red", true));
		displayObject(new _3_Rectangle1(1, 1, "black", true));
	}

	/** Display geometric object properties */
	public static void displayObject(_3_GeometricObject1 object) {
		System.out.println("Created on " + object.getDateCreated()
				+ ". Color is " + object.getColor());
	}
}
