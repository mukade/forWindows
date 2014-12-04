class Apple{
	static int num = 3;
	public Apple(){}
}

public class StaticTest {
	
	public static void main(String[] args) {
		Apple a1 = new Apple();
		a1 = null;
		System.out.println(a1.num);
		a1.num = 4;
		System.out.println("gai");
		System.out.println(a1.num);
		Apple a2 = new Apple();
		a2.num = 5;
		System.out.println("gai");
		System.out.println(a1.num);
		System.out.println(a2.num);
	}

}
