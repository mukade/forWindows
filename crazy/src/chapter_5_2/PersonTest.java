package chapter_5_2;
class Person{
	public String name;
	public static int eyeNum;
}
public class PersonTest {
	public static void main(String args[]){
//		System.out.println("person��eyeNumֵΪ��"+Person.eyeNum);
//		Person p = new Person();
//		System.out.println("p������nameֵΪ��"+p.name+" p�����eyeNumֵΪ��"+p.eyeNum);
//		p.name = "�����";
//		p.eyeNum=2;
//		System.out.println("p������nameֵΪ��"+p.name+" p�����eyeNumֵΪ��"+p.eyeNum);
//		System.out.println("Person��eyeNumֵΪ��"+Person.eyeNum);
//		Person p2 = new Person();
//		System.out.println("p2�����eyeNumֵΪ��"+p2.eyeNum);
		Person p1 = new Person();
		Person p2 = new Person();
		p1.name = "����";
		p2.name = "�����";
		p1.eyeNum=2;
		p2.eyeNum=3;
	}
}
