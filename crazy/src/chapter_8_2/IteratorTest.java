package chapter_8_2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String args[]){
		Collection books=new HashSet();
		books.add("������");
		books.add("���java");
		books.add("���android");
		Iterator it=books.iterator();
		while(it.hasNext()){
			String book=(String)it.next();
			System.out.println(book);
			if(book.equals("���java")){
				it.remove();
			}
//			book="�����ַ���";
		}
		System.out.println(books);
	}
}
