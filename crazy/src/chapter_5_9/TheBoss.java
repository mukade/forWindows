package chapter_5_9;
class Root{
	static{
		System.out.println("R����");
	}
	{
		System.out.println("R�ճ�");
	}
	public Root(){
		System.out.println("R�޲ι�");
	}
}
class Mid extends Root{
	static{
		System.out.println("M����");
	}
	{
		System.out.println("M�ճ�");
	}
	public Mid(){
		System.out.println("M�޲ι�");
	}
	public Mid(String msg){
		this();
		System.out.println("M���ι���"+msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("L����");
	}
	{
		System.out.println("L�ճ�");
	}
	public Leaf(){
		super("���java");
		System.out.println("ִ��Leaf�Ĺ�����");
	}
}
public class TheBoss {
	public static void main(String args[]){
		new Leaf();
		new Leaf();
	}
}
