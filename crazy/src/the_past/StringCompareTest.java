package the_past;
public class StringCompareTest {
	public static void main(String args[]){
		String s1 = "·è¿ñjava";
		String s2 = "·è¿ñ";
		String s3 = "java";
		String s4 = "·è¿ñ"+"java";
		String s5 = "·è"+"¿ñ"+"java";
		String s6 = s2+s3;
		String s7 = new String("·è¿ñjava");
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s1 == s6);
		System.out.println(s1 == s7);
	}
}
