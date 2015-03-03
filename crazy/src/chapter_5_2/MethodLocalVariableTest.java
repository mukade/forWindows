package chapter_5_2;

public class MethodLocalVariableTest {
	public static void main(String args[])
	{
		int a;
//		System.out.println(a);
//		a=5;
		{
			a = 5;
			System.out.println(a);
		}
//		int a=4;
		System.out.println(a);
	}
}
