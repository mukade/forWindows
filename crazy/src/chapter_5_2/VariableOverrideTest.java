package chapter_5_2;

import chapter_5_1.ThisInConstructor;

public class VariableOverrideTest {
	private String name="Àî¸Õ";
	private static double price =78.0;
	public static void main(String args[]){
		int price = 65;
		System.out.println(price);
		System.out.println(VariableOverrideTest.price);
		new VariableOverrideTest().info();
	}
	public void info(){
		String name = "ËïÎò¿Õ";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this.price);
	}
}
