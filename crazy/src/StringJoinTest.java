
public class StringJoinTest {
	public static void main(String args[]){
		String s1 = "���java";
		String s2 = "���"+"java";
		System.out.println(s1 == s2);
		final String str1 = "���";
		final String str2 = "java";
		String s3 = str1+str2;
		System.out.println(s1 == s3);
	}
}
