package chapter_5_2;

public class Overload {
	public void test(){
		System.out.println("no para");
	}
	public void test(String msg){
		System.out.println("overload test "+msg);
	}
	public static void main(String argsString[]){
		Overload ol = new Overload();
		ol.test();
		ol.test("hi");
	}
}
