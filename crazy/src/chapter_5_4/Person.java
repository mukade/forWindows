package chapter_5_4;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name.length()>6||name.length()<2){
			System.out.println("��������ֲ��Ϸ�");
		}
		else{
			this.name=name;
		}
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age>100||age<0){
			System.out.println("��������䲻�Ϸ�");
		}
		else{
			this.age=age;
		}
	}
	
}
