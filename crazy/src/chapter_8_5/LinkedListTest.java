package chapter_8_5;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String args[]){
		LinkedList books=new LinkedList();
		books.offer("疯狂java");//加入队尾
		books.push("轻量级");//加入栈顶
		books.offerFirst("疯狂android");//加入队头
		for(int i=0;i<books.size();i++){
			System.out.println(books.get(i));
		}
		System.out.println(books.peekFirst());//输出队头但不删除
		System.out.println(books.peekLast());//输出队尾但不删除
		System.out.println(books);//输出队列
		System.out.println(books.pop());//弹出栈顶（即队头）并删除
		System.out.println(books);//输出队列
		System.out.println(books.pollLast());//拉出队尾元素
		System.out.println(books);
		
		
	}
}
