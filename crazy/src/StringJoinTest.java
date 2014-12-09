
public class StringJoinTest {
	public static void main(String args[]){
		String s1 = "·è¿ñjava";
		String s2 = "·è¿ñ"+"java";
		System.out.println(s1 == s2);
		final String str1 = "·è¿ñ";
		final String str2 = "java";
		String s3 = str1+str2;
		System.out.println(s1 == s3);
	}
}
