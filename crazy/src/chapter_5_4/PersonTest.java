package chapter_5_4;

public class PersonTest {
	public static void main(String args[]){
		Person p1=new Person();
//		p.age=1000;
		p1.setAge(1000);
		System.out.println("p1�����䣺"+p1.getAge());
		System.out.println("p1�����֣�"+p1.getName());
		p1.setAge(30);
		System.out.println("�޸ĺ�p1�����䣺"+p1.getAge());
		p1.setName("���");
//		p1.name="hi";
		p1.setName("���2");
		System.out.println("�޸ĺ�p1�����֣�"+p1.getName());
	}
}
