class Root
{
	static{
	    System.out.println("Root �ľ�̬��ʼ����");
	}
	{
		System.out.println("Root ����ͨ��ʼ����");
	}
    public Root()
	{
		System.out.println("Root ���޲����Ĺ�����");
	}
    public Root(String msg){
    	System.out.println("Root�Ĵ��ι�����");
    }
}

class Mid extends Root
{
	static{
		System.out.println("Mid �ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid����ͨ��ʼ����");
	}
	public Mid()
	{
		System.out.println("Mid ���޲����Ĺ�����");
		System.out.println("1");
	}
	public Mid(String msg)
	{
		//ͨ��this����ͬһ�������صĹ�����
		this();System.out.println("here");
		System.out.println("Mid�Ĵ��ι�����,�����ֵ:" + msg);
	}
}

class Leaf extends Mid
{
	static{
		System.out.println("Leaf �ľ�̬��ʼ����");
	}
	{
		System.out.println("Leaf ����ͨ��ʼ����");
		System.out.println("2");
	}
	public Leaf()
	{
		//ͨ��surper ���ø�������һ���ַ��������Ĺ�����
		super("Struts 2Ȩ��ָ��");
		System.out.println("3");
		System.out.println("ִ��Leaf�Ĺ�����");
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