package the_past;
public class StringCompareTest {
	public static void main(String args[]){
		String s1 = "���java";
		String s2 = "���";
		String s3 = "java";
		String s4 = "���"+"java";
		String s5 = "��"+"��"+"java";
		String s6 = s2+s3;
		String s7 = new String("���java");
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s1 == s6);
		System.out.println(s1 == s7);
	}
}
