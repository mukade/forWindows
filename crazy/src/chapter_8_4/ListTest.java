package chapter_8_4;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String args[]){
		List books=new ArrayList();
		books.add(new String("������"));
		books.add(new String("���java"));
		books.add(new String("���android"));
		System.out.println(books);
		books.add(1,new String("���ajax"));
		for(int i=0;i<books.size();i++){
			System.out.println(books.get(i));
		}
		books.remove(2);//ɾ����3��Ԫ��
		System.out.println(books);
		System.out.println(books.indexOf(new String("���ajax")));
		books.set(1,new String("���java"));
		System.out.println(books);
		System.out.println(books.subList(1,2));
	}
}
