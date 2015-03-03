package chapter_8_2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String args[]){
		Collection books=new HashSet();
		books.add("ÇáÁ¿¼¶");
		books.add("·è¿ñjava");
		books.add("·è¿ñandroid");
		Iterator it=books.iterator();
		while(it.hasNext()){
			String book=(String)it.next();
			System.out.println(book);
			if(book.equals("·è¿ñjava")){
				it.remove();
			}
//			book="²âÊÔ×Ö·û´®";
		}
		System.out.println(books);
	}
}
