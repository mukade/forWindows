package the_past;

class Person {
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public void info(){
		System.out.println("此人名为："+name);
	}
	
	public String toString(){
		return this.name;
	}
}
 public class PrintObject{
	 public static void main(String args[]){
		 Person p = new Person("孙悟空");
		 System.out.println(p);
	 }
 }
