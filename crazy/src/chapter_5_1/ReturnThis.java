package chapter_5_1;

public class ReturnThis {
	public int age;
	public ReturnThis grow(){
		this.age++;
		return this;
	}
	public static void main(String[] argsStrings){
		ReturnThis rt = new ReturnThis();
		rt.grow().grow().grow();
		System.out.println("rt's age is: "+rt.age);
	}
}
