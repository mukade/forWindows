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
		books.add(new String("������"));
		books.add(new String("���java"));
		books.add(new String("���android"));
		System.out.println(books);
		books.remove(new A());
		
	}
}
