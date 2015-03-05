package the_past;

public class FinalReplaceTest {
	public static void main(String[] args){
		final int a = 5+2;
		final double b = 1.2/3;
		final String str = "·è¿ñ"+"java";
		final String book = "·è¿ñjava½²Òå£º"+99.0;
		final String book2 = "·è¿ñjava½²Òå£º"+String.valueOf(99.0);
		System.out.println(book == "·è¿ñjava½²Òå£º99.0");
		System.out.println(book2 == "·è¿ñjava½²Òå£º99.0");
	}
}
