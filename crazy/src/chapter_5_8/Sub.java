package chapter_5_8;

class Base{
	public Base(){
		test();
	}
	public void test(){
		System.out.println("����������д�ķ���");
	}
}
public class Sub extends Base{
	private String name;
	public void test(){
		this.name="hi";
		System.out.println("������д����ķ�������name�ַ�������Ϊ"+name.length());
	}
	public static void main(String args[]){
		Sub s =new Sub();
	}
}
