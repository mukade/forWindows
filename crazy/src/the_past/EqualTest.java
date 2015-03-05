package the_past;


public class EqualTest {
	public static void main(String[] args)
	{
		int it = 65;
		float f1 = 65.0f;
		System.out.println("65 equals 65.0f?"+(it == f1));
		char ch = 'A';
		System.out.println("65和A是否相等？"+(it == ch));
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("str1和str2是否相等"+(str1 == str2));
		System.out.println("str是否equal了str2？"+(str1.equals(str2)));
		System.out.println("hello".equals(new EqualTest()) );
	}
}
