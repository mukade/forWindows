package chapter_5_9;
class Root{
	static{
		System.out.println("R静初");
	}
	{
		System.out.println("R普初");
	}
	public Root(){
		System.out.println("R无参构");
	}
}
class Mid extends Root{
	static{
		System.out.println("M静初");
	}
	{
		System.out.println("M普初");
	}
	public Mid(){
		System.out.println("M无参构");
	}
	public Mid(String msg){
		this();
		System.out.println("M带参构："+msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("L静初");
	}
	{
		System.out.println("L普初");
	}
	public Leaf(){
		super("疯狂java");
		System.out.println("执行Leaf的构造器");
	}
}
public class TheBoss {
	public static void main(String args[]){
		new Leaf();
		new Leaf();
	}
}
