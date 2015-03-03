package chapter_8_4;

import java.util.List;
import java.util.ArrayList;

class A{
	public boolean equals(Object obj){
		return true;
	}
}
public class ListTest2 {
	public static void main(String args[]){
		List books=new ArrayList();
		books.add(new String("ÇáÁ¿¼¶"));
		books.add(new String("·è¿ñjava"));
		books.add(new String("·è¿ñandroid"));
		System.out.println(books);
		books.remove(new A());
		
	}
}
