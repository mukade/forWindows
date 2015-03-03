package chapter_8_4;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String args[]){
		List books=new ArrayList();
		books.add(new String("ÇáÁ¿¼¶"));
		books.add(new String("·è¿ñjava"));
		books.add(new String("·è¿ñandroid"));
		System.out.println(books);
		books.add(1,new String("·è¿ñajax"));
		for(int i=0;i<books.size();i++){
			System.out.println(books.get(i));
		}
		books.remove(2);//É¾³ýµÚ3¸öÔªËØ
		System.out.println(books);
		System.out.println(books.indexOf(new String("·è¿ñajax")));
		books.set(1,new String("·è¿ñjava"));
		System.out.println(books);
		System.out.println(books.subList(1,2));
	}
}
