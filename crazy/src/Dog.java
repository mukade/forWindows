import java.util.Arrays;
import java.util.Comparator;

public class Dog {

	public static void main(String[] args) {

		int[] height = {6, 2, 3, 4, 5, 7};

		Integer[] heightIntegerAry = new Integer[height.length];

		for (int i = 0; i < height.length; i++) {
			heightIntegerAry[i] = new Integer(height[i]);
		}

		Arrays.sort(heightIntegerAry, new DoggyStyle());
		System.out.println(Arrays.toString(heightIntegerAry));
	}

}

class DoggyStyle implements Comparator {

	public int compare(Object arg0, Object arg1) {

		int first = ((Integer) arg0).intValue();
		int second = ((Integer) arg1).intValue();

		if (first > second) {
			return -1;
		} else {
			return 1;
		}
	}

}