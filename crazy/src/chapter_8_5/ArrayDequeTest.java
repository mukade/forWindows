package chapter_8_5;

import java.util.ArrayDeque;

public class ArrayDequeTest {
	public static void main(String args[]){
		ArrayDeque stack=new ArrayDeque();
		//����push3��Ԫ��
		stack.push("���java");
		stack.push("������");
		stack.push("���android");
		System.out.println(stack);//���ջ
		System.out.println(stack.peek());//�����ͷ���˴���ջ����
		System.out.println(stack);//�ٴ����ջ
		System.out.println(stack.pop());//���pop����ջ��
		System.out.println(stack);//�����ʱ��ջ
		
	}
}
