package chapter_8_5;

import java.util.ArrayDeque;

public class ArrayDequeTest {
	public static void main(String args[]){
		ArrayDeque stack=new ArrayDeque();
		//依次push3个元素
		stack.push("疯狂java");
		stack.push("轻量级");
		stack.push("疯狂android");
		System.out.println(stack);//输出栈
		System.out.println(stack.peek());//输出队头（此处即栈顶）
		System.out.println(stack);//再次输出栈
		System.out.println(stack.pop());//输出pop出的栈顶
		System.out.println(stack);//输出此时的栈
		
	}
}
