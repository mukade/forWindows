package the_past;


public class EqualTest {
	public static void main(String[] args)
	{
		int it = 65;
		float f1 = 65.0f;
		System.out.println("65 equals 65.0f?"+(it == f1));
		char ch = 'A';
		System.out.println("65��A�Ƿ���ȣ�"+(it == ch));
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("str1��str2�Ƿ����"+(str1 == str2));
		System.out.println("str�Ƿ�equal��str2��"+(str1.equals(str2)));
		System.out.println("hello".equals(new EqualTest()) );
	}
}
