package chapter_8_5;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String args[]){
		LinkedList books=new LinkedList();
		books.offer("���java");//�����β
		books.push("������");//����ջ��
		books.offerFirst("���android");//�����ͷ
		for(int i=0;i<books.size();i++){
			System.out.println(books.get(i));
		}
		System.out.println(books.peekFirst());//�����ͷ����ɾ��
		System.out.println(books.peekLast());//�����β����ɾ��
		System.out.println(books);//�������
		System.out.println(books.pop());//����ջ��������ͷ����ɾ��
		System.out.println(books);//�������
		System.out.println(books.pollLast());//������βԪ��
		System.out.println(books);
		
		
	}
}
