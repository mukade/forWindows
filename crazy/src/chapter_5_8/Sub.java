package chapter_5_8;

class Base{
	public Base(){
		test();
	}
	public void test(){
		System.out.println("将被子类重写的方法");
	}
}
public class Sub extends Base{
	private String name;
	public void test(){
		this.name="hi";
		System.out.println("子类重写父类的方法：其name字符串长度为"+name.length());
	}
	public static void main(String args[]){
		Sub s =new Sub();
	}
}
