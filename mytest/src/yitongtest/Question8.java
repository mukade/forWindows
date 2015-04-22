package yitongtest;

public class Question8 {
	public static void add3(Integer i){
		int val=i.intValue();
		val +=3;
		i=new Integer(val);
		System.out.println(i);
	}
	public static void main(String args[]){
		Integer e=new Integer(0);
		add3(e);
		System.out.println(e.intValue());
	}
}
