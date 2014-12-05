class Root
{
	static{
	    System.out.println("Root 的静态初始化块");
	}
	{
		System.out.println("Root 的普通初始化块");
	}
    public Root()
	{
		System.out.println("Root 的无参数的构造器");
	}
    public Root(String msg){
    	System.out.println("Root的带参构造器");
    }
}

class Mid extends Root
{
	static{
		System.out.println("Mid 的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}
	public Mid()
	{
		System.out.println("Mid 的无参数的构造器");
		System.out.println("1");
	}
	public Mid(String msg)
	{
		//通过this调用同一类中重载的构造器
		this();System.out.println("here");
		System.out.println("Mid的带参构造器,其参数值:" + msg);
	}
}

class Leaf extends Mid
{
	static{
		System.out.println("Leaf 的静态初始化块");
	}
	{
		System.out.println("Leaf 的普通初始化块");
		System.out.println("2");
	}
	public Leaf()
	{
		//通过surper 调用父类中有一个字符串参数的构造器
		super("Struts 2权威指南");
		System.out.println("3");
		System.out.println("执行Leaf的构造器");
		System.out.println("4");
	}
}

public class ClassInitializationTest
{
	public static void main(String[] args)
	{
		new Leaf();
//		new Leaf();
	}
}