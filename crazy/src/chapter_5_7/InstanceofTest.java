package chapter_5_7;

public class InstanceofTest {
	public static void main(String args[]){
		Object hello ="Hello";
		System.out.println("�ַ����Ƿ���Object���ʵ����"+(hello instanceof Object));
		System.out.println("�ַ����Ƿ���String���ʵ����"+(hello instanceof String));
		System.out.println("�ַ����Ƿ���Math���ʵ����"+(hello instanceof Math));
		System.out.println("�ַ����Ƿ���comparable�ӿڵ�ʵ�֣�"+(hello instanceof Comparable));
		String a="Hello";
		System.out.println("�ַ����Ƿ���Math���ʵ����"+(hello instanceof Math));
	}
}
