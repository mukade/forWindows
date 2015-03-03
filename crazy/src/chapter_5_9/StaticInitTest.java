package chapter_5_9;

public class StaticInitTest {
	static int a=9;
	static{
		a=6;
	}
	
	public static void main(String args[]){
		System.out.println(StaticInitTest.a);
	}
}
