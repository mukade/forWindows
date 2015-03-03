package chapter_5_9;

public class InstanceInitTest {
	
	{
		a=6;
	}
	private int a=9;
	public static void main(String args[]){
		System.out.println(new InstanceInitTest().a);
	}	
}
