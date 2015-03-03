package chapter_5_2;
class Person{
	public String name;
	public static int eyeNum;
}
public class PersonTest {
	public static void main(String args[]){
//		System.out.println("person的eyeNum值为："+Person.eyeNum);
//		Person p = new Person();
//		System.out.println("p变量的name值为："+p.name+" p对象的eyeNum值为："+p.eyeNum);
//		p.name = "孙悟空";
//		p.eyeNum=2;
//		System.out.println("p变量的name值为："+p.name+" p对象的eyeNum值为："+p.eyeNum);
//		System.out.println("Person的eyeNum值为："+Person.eyeNum);
//		Person p2 = new Person();
//		System.out.println("p2对象的eyeNum值为："+p2.eyeNum);
		Person p1 = new Person();
		Person p2 = new Person();
		p1.name = "张三";
		p2.name = "孙悟空";
		p1.eyeNum=2;
		p2.eyeNum=3;
	}
}
