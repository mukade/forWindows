package chapter_5_4;

public class PersonTest {
	public static void main(String args[]){
		Person p1=new Person();
//		p.age=1000;
		p1.setAge(1000);
		System.out.println("p1的年龄："+p1.getAge());
		System.out.println("p1的名字："+p1.getName());
		p1.setAge(30);
		System.out.println("修改后p1的年龄："+p1.getAge());
		p1.setName("李刚");
//		p1.name="hi";
		p1.setName("李刚2");
		System.out.println("修改后p1的名字："+p1.getName());
	}
}
